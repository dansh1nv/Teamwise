package com.vladimir.teamwise.feature.chatroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.vladimir.teamwise.R
import com.vladimir.teamwise.platform.BaseFragment
import kotlinx.android.synthetic.main.host_activity.*

class ChatRoomFragment : BaseFragment(R.layout.chatroom_fragment) {

    private lateinit var viewModel: ChatRoomViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity?.bottom_nav_view?.visibility = View.VISIBLE
        activity?.toolbar?.visibility = View.VISIBLE
        viewModel = ViewModelProvider(this).get(ChatRoomViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance() = ChatRoomFragment()
    }
}
