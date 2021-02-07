package com.vladimir.teamwise.feature.informationdetail

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.InformaionDetailFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class InformationDetailFragment : BaseFragment(R.layout.informaion_detail_fragment) {

    private lateinit var viewModel: InformationDetailViewModel
    private val binding by viewBinding(InformaionDetailFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(InformationDetailViewModel::class.java)
    }

    companion object {
        fun newInstance() = InformationDetailFragment()
    }
}
