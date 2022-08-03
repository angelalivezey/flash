package com.example.angela.flash

import androidx.lifecycle.ViewModel

class DecksSharedViewModel : ViewModel() {

    var deckList: MutableList<Deck> = mutableListOf(
        Deck("Music", "yellow"),
        Deck("Art History", "yellow"),
        Deck("Kotlin", "blue"),
    )
    fun addNewDeck(deck: Deck){
        deckList.add(deck)
    }
}