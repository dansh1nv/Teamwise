package com.vladimir.teamwise.ui.addition

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.vladimir.teamwise.R

class AdditionFragment : Fragment() {

    companion object {
        fun newInstance() = AdditionFragment()
    }

    private lateinit var viewModel: AdditionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.addition_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AdditionViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
