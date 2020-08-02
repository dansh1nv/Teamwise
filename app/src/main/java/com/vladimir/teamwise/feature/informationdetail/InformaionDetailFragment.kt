package com.vladimir.teamwise.feature.informationdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import kotlinx.android.synthetic.main.host_activity.*

class InformaionDetailFragment : Fragment() {

    companion object {
        fun newInstance() = InformaionDetailFragment()
    }

    private lateinit var viewModel: InformaionDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.informaion_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.VISIBLE
        activity?.toolbar?.visibility = View.VISIBLE
        viewModel = ViewModelProvider(this).get(InformaionDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
