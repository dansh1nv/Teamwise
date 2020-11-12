package com.vladimir.teamwise.feature.start

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.StartFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment

class StartFragment : BaseFragment(R.layout.start_fragment) {

    private lateinit var viewModel: StartViewModel
    private lateinit var binding: StartFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = StartFragmentBinding.inflate(layoutInflater)
        binding.regButton.setOnClickListener {
            val regStringArg = "registration"
            val action = StartFragmentDirections.regAction(/*regStringArg*/)
            findNavController().navigate(action)
        }

        binding.authButton.setOnClickListener {
            val authStringArg = "auth"
            val action = StartFragmentDirections.authAction(/*authStringArg*/)
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