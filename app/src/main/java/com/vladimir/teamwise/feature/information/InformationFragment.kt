package com.vladimir.teamwise.feature.information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment


class InformationFragment : BaseFragment(R.layout.information_fragment) {

    private lateinit var viewModel: InformationViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(InformationViewModel::class.java)
    }

    companion object {
        fun newInstance() = InformationFragment()
    }
}
