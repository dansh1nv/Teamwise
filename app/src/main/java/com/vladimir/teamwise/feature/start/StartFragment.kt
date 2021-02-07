package com.vladimir.teamwise.feature.start

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.StartFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.Constants
import com.vladimir.teamwise.platform.Constants.AUTH_ARGUMENT
import com.vladimir.teamwise.platform.Constants.REGISTRATION_ARGUMENT
import com.vladimir.teamwise.platform.core.viewBinding

class StartFragment : BaseFragment(R.layout.start_fragment) {

    private lateinit var viewModel: StartViewModel
    private val binding by viewBinding(StartFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.regButton.setOnClickListener {
            val action = StartFragmentDirections.regAction(REGISTRATION_ARGUMENT)
            findNavController().navigate(action)
        }

        binding.authButton.setOnClickListener {
            val action = StartFragmentDirections.authAction(AUTH_ARGUMENT)
            findNavController().navigate(action)
        }
        viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        /*activity?.bottom_nav_view?.visibility = View.GONE
        activity?.toolbar?.visibility = View.GONE*/
    }

    companion object {
        fun newInstance() = StartFragment()
    }
}