package com.vladimir.teamwise.feature.chatroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.databinding.ChatFragmentBinding
import com.vladimir.teamwise.platform.BaseFragment
import com.vladimir.teamwise.platform.core.viewBinding

class ChatRoomFragment : BaseFragment(R.layout.chatroom_fragment) {

    private lateinit var viewModel: ChatRoomViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ChatRoomViewModel::class.java)
    }

    companion object {
        fun newInstance() = ChatRoomFragment()
    }
}
