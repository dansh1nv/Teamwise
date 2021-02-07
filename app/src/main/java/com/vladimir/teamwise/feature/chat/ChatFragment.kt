package com.vladimir.teamwise.feature.chat

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.ChatFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class ChatFragment : BaseFragment(R.layout.chat_fragment) {

    private lateinit var viewModel: ChatViewModel
    private val binding by viewBinding(ChatFragmentBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChatViewModel::class.java)
    }

    companion object {
        fun newInstance() = ChatFragment()
    }
}