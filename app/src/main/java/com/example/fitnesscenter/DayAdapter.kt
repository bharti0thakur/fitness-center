package com.example.fitnesscenter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DayAdapter(
    private val days: List<HomeActivity.Day>,
    private val onItemClick: (HomeActivity.Day) -> Unit
) : RecyclerView.Adapter<DayAdapter.DayViewHolder>() {

    inner class DayViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayImage: ImageView = view.findViewById(R.id.dayImage)
        val dayTitle: TextView = view.findViewById(R.id.dayTitle)
        val daySubtitle: TextView = view.findViewById(R.id.daySubtitle)
        val statusDot: View = view.findViewById(R.id.statusDot)

        init {
            view.setOnClickListener {
                onItemClick(days[adapterPosition])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_day_card, parent, false)
        return DayViewHolder(view)
    }

    override fun onBindViewHolder(holder: DayViewHolder, position: Int) {
        val day = days[position]
        holder.dayImage.setImageResource(day.imageRes)
        holder.dayTitle.text = day.title
        holder.daySubtitle.text = day.subtitle
        holder.statusDot.setBackgroundResource(
            if (day.completed) R.drawable.status_dot_done
            else android.R.color.darker_gray
        )
    }

    override fun getItemCount(): Int = days.size
}
