package com.vladimir.teamwise.feature.auth

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.Constants.INFORMATION_ARG
import kotlinx.android.synthetic.main.auth_fragment.*
import kotlinx.android.synthetic.main.host_activity.*

class AuthFragment : BaseFragment(R.layout.auth_fragment) {

    private lateinit var viewModel: AuthViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth_button.setOnClickListener {
            val action = AuthFragmentDirections.nextAction(INFORMATION_ARG)
            findNavController().navigate(action)
        }
        //view.bottom_nav_view.visibility = View.GONE
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.GONE
        activity?.toolbar?.visibility = View.GONE
        viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = AuthFragment()
    }
}
