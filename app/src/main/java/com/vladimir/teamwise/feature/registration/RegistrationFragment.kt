package com.vladimir.teamwise.feature.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.Constants
import com.vladimir.teamwise.platform.Constants.INFORMATION_ARG
import kotlinx.android.synthetic.main.host_activity.*
import kotlinx.android.synthetic.main.registration_fragment.*

class RegistrationFragment : BaseFragment(R.layout.registration_fragment) {

    private lateinit var viewModel: RegistrationViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        reg_button.setOnClickListener {
            viewModel.registration()
            val action = RegistrationFragmentDirections.nextAction(INFORMATION_ARG)
            findNavController().navigate(action)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.GONE
        activity?.toolbar?.visibility = View.GONE
        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = RegistrationFragment()
    }
}
