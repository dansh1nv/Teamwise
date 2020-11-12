package com.vladimir.teamwise.feature.informationdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment

class InformationDetailFragment : BaseFragment(R.layout.informaion_detail_fragment) {

    private lateinit var viewModel: InformationDetailViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(InformationDetailViewModel::class.java)
    }

    companion object {
        fun newInstance() = InformationDetailFragment()
    }
}
