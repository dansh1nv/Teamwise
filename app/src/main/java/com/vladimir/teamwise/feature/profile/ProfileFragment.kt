package com.vladimir.teamwise.feature.profile

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.ProfileFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class ProfileFragment : BaseFragment(R.layout.profile_fragment) {

    private lateinit var viewModel: ProfileViewModel
    private val binding by viewBinding(ProfileFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)
    }

    companion object {
        fun newInstance() = ProfileFragment()
    }
}
