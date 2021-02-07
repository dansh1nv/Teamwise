package com.vladimir.teamwise.feature.information

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.InformationFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding


class InformationFragment : BaseFragment(R.layout.information_fragment) {

    private lateinit var viewModel: InformationViewModel
    private val binding by viewBinding(InformationFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(InformationViewModel::class.java)
    }

    companion object {
        fun newInstance() = InformationFragment()
    }
}
