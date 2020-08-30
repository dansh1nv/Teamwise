package com.vladimir.teamwise.feature.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment
import kotlinx.android.synthetic.main.host_activity.*

class ChatFragment : BaseFragment(R.layout.chat_fragment) {

    private lateinit var viewModel: ChatViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.VISIBLE
        activity?.toolbar?.visibility = View.VISIBLE
        viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = ChatFragment()
    }
}
