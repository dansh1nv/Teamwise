package com.vladimir.teamwise.feature.auth

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.AuthFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.Constants.INFORMATION_ARG

class AuthFragment : BaseFragment(R.layout.auth_fragment) {

    private lateinit var viewModel: AuthViewModel
    private lateinit var binding: AuthFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.authButton.setOnClickListener {
            val action = AuthFragmentDirections.nextAction(/*INFORMATION_ARG*/)
            findNavController().navigate(action)
        }
        //view.bottom_nav_view.visibility = View.GONE
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
    }

    companion object {
        fun newInstance() = AuthFragment()
    }
}
