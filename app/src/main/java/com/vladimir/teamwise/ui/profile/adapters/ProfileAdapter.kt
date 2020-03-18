package com.vladimir.teamwise.ui.profile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vladimir.teamwise.data.models.EventInfo

class ProfileAdapter(var partProfileEventList: List<EventInfo>) :
    RecyclerView.Adapter<ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return ProfileViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        //holder.bind(partProfileEventList[position])
    }

    override fun getItemCount(): Int = partProfileEventList.size

}