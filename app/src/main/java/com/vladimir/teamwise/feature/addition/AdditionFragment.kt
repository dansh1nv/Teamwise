package com.vladimir.teamwise.feature.addition

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.AdditionFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class AdditionFragment : BaseFragment(R.layout.addition_fragment) {

    private lateinit var viewModel: AdditionViewModel
    private val binding by viewBinding(AdditionFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(AdditionViewModel::class.java)
    }

    companion object {
        fun newInstance() = AdditionFragment()
    }
}
