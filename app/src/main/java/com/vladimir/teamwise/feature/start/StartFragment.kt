package com.vladimir.teamwise.feature.start

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment
import kotlinx.android.synthetic.main.host_activity.*
import kotlinx.android.synthetic.main.registration_fragment.reg_button
import kotlinx.android.synthetic.main.start_fragment.*


class StartFragment : BaseFragment(R.layout.start_fragment) {

    private lateinit var viewModel: StartViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        reg_button?.setOnClickListener {
            val regStringArg = "registration"
            val action = StartFragmentDirections.regAction(regStringArg)
            findNavController().navigate(action)
        }

        auth_button?.setOnClickListener {
            val authStringArg = "auth"
            val action = StartFragmentDirections.authAction(authStringArg)
            findNavController().navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.GONE
        activity?.toolbar?.visibility = View.GONE
        viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = StartFragment()
    }
}