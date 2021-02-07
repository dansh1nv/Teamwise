package com.vladimir.teamwise.feature.search

import android.Manifest
import android.content.ContentValues.TAG
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mapbox.android.core.permissions.PermissionsListener
import com.mapbox.android.core.permissions.PermissionsManager
import com.mapbox.mapboxsdk.location.LocationComponentActivationOptions
import com.mapbox.mapboxsdk.location.modes.CameraMode
import com.mapbox.mapboxsdk.location.modes.RenderMode
import com.mapbox.mapboxsdk.maps.MapView
import com.mapbox.mapboxsdk.maps.MapboxMap
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback
import com.mapbox.mapboxsdk.maps.Style
import com.mapbox.mapboxsdk.plugins.localization.LocalizationPlugin
import com.mapbox.mapboxsdk.plugins.localization.MapLocale
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.SearchFragmentBinding
import com.vladimir.teamwise.platform.core.viewBinding
import timber.log.Timber


class SearchFragment : Fragment(), OnMapReadyCallback, PermissionsListener {

    private val RUSSIAN = MapLocale("name_ru")

    private lateinit var viewModel: SearchViewModel

    private lateinit var mapView: MapView
    private lateinit var mMapBoxMap: MapboxMap
    private lateinit var permissionsManager: PermissionsManager

    private val binding by viewBinding(SearchFragmentBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        val view = inflater.inflate(R.layout.search_fragment, container, false)
        mapView = view.findViewById(R.id.mapView)
        mapView.onCreate(savedInstanceState)
        mapView.getMapAsync(this)
        return view
    }

    override fun onMapReady(mapboxMap: MapboxMap) {
        mMapBoxMap = mapboxMap
        mapboxMap.setStyle(Style.MAPBOX_STREETS) { style ->
            enableLocationComponent(style)
            val localizationPlugin = LocalizationPlugin(mapView, mapboxMap, style)

            try {
                localizationPlugin.setMapLanguage(RUSSIAN)
            } catch (exception: RuntimeException) {
                Timber.tag(TAG).d(exception.toString())
            }
        }
    }

    private fun enableLocationComponent(loadedMapStyle: Style) {
        if (PermissionsManager.areLocationPermissionsGranted(activity)) {
            // Get an instance of the component
            val locationComponent = mMapBoxMap.locationComponent
            // Activate with options
            locationComponent.activateLocationComponent(
                LocationComponentActivationOptions.builder(requireActivity(), loadedMapStyle)
                    .build()
            )
            // Enable to make component visible
            context?.let {
                if (ActivityCompat.checkSelfPermission(
                        it,
                        Manifest.permission.ACCESS_FINE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        it,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    locationComponent.isLocationComponentEnabled = true
                    // Set the component's camera mode
                    locationComponent.cameraMode = CameraMode.TRACKING
                    // Set the component's render mode
                    locationComponent.renderMode = RenderMode.COMPASS
                    return
                }
            }


        } else {
            permissionsManager = PermissionsManager(this)
            permissionsManager.requestLocationPermissions(activity)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        permissionsManager.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onExplanationNeeded(permissionsToExplain: MutableList<String>?) {
        Toast.makeText(context, R.string.user_location_permission_explanation, Toast.LENGTH_LONG)
            .show()
    }

    override fun onPermissionResult(granted: Boolean) {
        if (granted) {
            mMapBoxMap.getStyle { this.enableLocationComponent(it) }
        } else {
            Toast.makeText(
                context,
                R.string.user_location_permission_not_granted,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
        if (savedInstanceState != null) {
            mapView.onSaveInstanceState(savedInstanceState)
        }
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mapView.onDestroy()
    }

    companion object {
        fun newInstance() = SearchFragment()
    }
}
