package com.vladimir.teamwise.feature.registration

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.RegistrationFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class RegistrationFragment : BaseFragment(R.layout.registration_fragment) {

    private lateinit var viewModel: RegistrationViewModel
    private val binding by viewBinding(RegistrationFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.regButton.setOnClickListener {
            viewModel.registration()
            val action = RegistrationFragmentDirections.nextAction(/*INFORMATION_ARG*/)
            findNavController().navigate(action)
        }
        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)
    }

    companion object {
        fun newInstance() = RegistrationFragment()
    }
}
