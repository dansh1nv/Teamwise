package com.vladimir.teamwise.feature.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment

class ChatFragment : BaseFragment(R.layout.chat_fragment) {

    private lateinit var viewModel: ChatViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)
    }

    companion object {
        fun newInstance() = ChatFragment()
    }
}