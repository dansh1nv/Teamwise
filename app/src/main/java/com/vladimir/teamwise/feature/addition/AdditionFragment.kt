package com.vladimir.teamwise.feature.addition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import kotlinx.android.synthetic.main.host_activity.*

class AdditionFragment : Fragment() {

    companion object {
        fun newInstance() = AdditionFragment()
    }

    private lateinit var viewModel: AdditionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.addition_fragment, container, false)


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.VISIBLE
        activity?.toolbar?.visibility = View.VISIBLE
        viewModel = ViewModelProvider(this).get(AdditionViewModel::class.java).apply {

        }
        // TODO: Use the ViewModel
    }

}
