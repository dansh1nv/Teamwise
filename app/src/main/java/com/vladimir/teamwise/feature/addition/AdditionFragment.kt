package com.vladimir.teamwise.feature.addition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.AdditionFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment

class AdditionFragment : BaseFragment(R.layout.addition_fragment) {

    private lateinit var viewModel: AdditionViewModel
    private var additionFragmentBinding: AdditionFragmentBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = AdditionFragmentBinding.bind(view)
        additionFragmentBinding = binding
        viewModel = ViewModelProvider(this).get(AdditionViewModel::class.java)
    }

    companion object {
        fun newInstance() = AdditionFragment()
    }
}
