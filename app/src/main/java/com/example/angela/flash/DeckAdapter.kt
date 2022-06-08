package com.example.angela.flash

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class DeckAdapter(private var deckList: MutableList<Deck>) : RecyclerView.Adapter<DeckAdapter.ViewHolder>() {


    //set up items in the viewholder that will be changed
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val deckTitle: TextView = itemView.findViewById(R.id.deck_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeckAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.card_or_deck_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return deckList.size
    }
    override fun onBindViewHolder(holder: DeckAdapter.ViewHolder, position: Int) {
       val deck = deckList[position]
        holder.deckTitle.text = deck.titleText
    }


}