package com.example.angela.flash

import androidx.lifecycle.ViewModel

class DecksSharedViewModel : ViewModel() {

    var deckList: MutableList<Deck> = mutableListOf(
        Deck("Music", "pink"),
        Deck("Art History", "orange"),
        Deck("Kotlin","purple"))

}