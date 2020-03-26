package com.vladimir.teamwise.ui.chatroom.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vladimir.teamwise.data.models.UserInfo

class ChatRoomAdapter(var partChatAdapter: List<UserInfo>) : RecyclerView.Adapter<ChatRoomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatRoomViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ChatRoomViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ChatRoomViewHolder, position: Int) {
        //holder.bind(partChatAdapter[position])
    }

    override fun getItemCount(): Int = partChatAdapter.size
}