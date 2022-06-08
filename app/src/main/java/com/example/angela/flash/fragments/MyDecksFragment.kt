package com.example.angela.flash.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.angela.flash.Deck
import com.example.angela.flash.DeckAdapter
import com.example.angela.flash.R
import com.example.angela.flash.databinding.MyDecksFragmentBinding

class MyDecksFragment : Fragment(R.layout.my_decks_fragment){
    private lateinit var binding: MyDecksFragmentBinding
    private var deckList: MutableList<Deck> = mutableListOf(
        Deck("Music"),
        Deck("Art History"),
        Deck("Kotlin"),
        Deck("Android"),
        Deck("Jetpack Compose"),
        Deck("Java"),
        Deck("Swift"))
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.my_decks_fragment,
            container, false
        )

        binding.recyclerViewForDecks.adapter = DeckAdapter(deckList = deckList
        )
        return binding.root
    }

}