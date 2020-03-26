package com.vladimir.teamwise.ui.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.vladimir.teamwise.R


class StartFragment : Fragment() {

    companion object {
        fun newInstance() = StartFragment()
    }

    private lateinit var viewModel: StartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.start_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.reg_button)?.setOnClickListener {
            val regNumberArg = 1
            /*val action = StartFragmentDirection.regAction(regNumberArg)
            findNavController().navigate(action)*/
        }
        view.findViewById<Button>(R.id.auth_button)?.setOnClickListener {
            val authNumberArg = 2
            /*val action = StartFragmentDirection.authAction(authNumberArg)
            findNavController().navigate(action)*/
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
