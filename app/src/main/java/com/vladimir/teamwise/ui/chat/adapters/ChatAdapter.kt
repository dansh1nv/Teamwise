package com.vladimir.teamwise.ui.chat.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vladimir.teamwise.data.models.User

class ChatAdapter(var partChatAdapter: List<User>) : RecyclerView.Adapter<ChatViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ChatViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(partChatAdapter[position])
    }

    override fun getItemCount(): Int = partChatAdapter.size
}