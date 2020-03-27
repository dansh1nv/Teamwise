package com.vladimir.teamwise.ui.auth

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.bottomnavigation.BottomNavigationView

import com.vladimir.teamwise.R
import kotlinx.android.synthetic.main.host_activity.*
import kotlinx.android.synthetic.main.host_activity.view.*

class AuthFragment : Fragment() {

    companion object {
        fun newInstance() = AuthFragment()
    }

    private lateinit var viewModel: AuthViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.auth_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.auth_button).setOnClickListener {
            val informationStringArg = "information"
            val action = AuthFragmentDirections.nextAction(informationStringArg)
            findNavController().navigate(action)
        }
        //view.bottom_nav_view.visibility = View.GONE
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.GONE
        activity?.toolbar?.visibility = View.GONE
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
