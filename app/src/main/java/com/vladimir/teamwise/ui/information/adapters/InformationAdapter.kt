package com.vladimir.teamwise.ui.information.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vladimir.teamwise.data.models.EventInfo

class InformationAdapter(var partInformationAdapter: List<EventInfo>) :
    RecyclerView.Adapter<InformationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformationViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return InformationViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: InformationViewHolder, position: Int) {
        //holder.bind(partInformationAdapter[position])
    }

    override fun getItemCount(): Int = partInformationAdapter.size

}