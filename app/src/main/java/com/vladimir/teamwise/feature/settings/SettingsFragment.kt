package com.vladimir.teamwise.feature.settings

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.SettingsFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class SettingsFragment : BaseFragment(R.layout.settings_fragment) {

    private lateinit var viewModel: SettingsViewModel
    private val binding by viewBinding(SettingsFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(SettingsViewModel::class.java)
    }

    companion object {
        fun newInstance() = SettingsFragment()
    }
}
