package com.example.angela.flash

import androidx.recyclerview.widget.DiffUtil

class DeckDiffUtil(
    private var deckList: MutableList<Deck>,
    private var newDeckList: MutableList<Deck>
) : DiffUtil.Callback() {


    override fun getOldListSize(): Int {
        return deckList.size
    }

    override fun getNewListSize(): Int {
        return newDeckList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return deckList[oldItemPosition] == newDeckList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return when {
            deckList[oldItemPosition].titleText != newDeckList[newItemPosition].titleText -> {
                false
            }
            deckList[oldItemPosition].color != newDeckList[newItemPosition].color -> {
                false
            }
            else -> true
        }
    }
}