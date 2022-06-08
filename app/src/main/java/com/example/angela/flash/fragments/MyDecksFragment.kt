package com.example.angela.flash.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.angela.flash.DeckAdapter
import com.example.angela.flash.DecksSharedViewModel
import com.example.angela.flash.R
import com.example.angela.flash.databinding.MyDecksFragmentBinding

class MyDecksFragment : Fragment(R.layout.my_decks_fragment){
    private lateinit var binding: MyDecksFragmentBinding
    private lateinit var decksSharedViewModel: DecksSharedViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.my_decks_fragment,
            container, false
        )
        decksSharedViewModel = ViewModelProvider(this).get(DecksSharedViewModel::class.java)
        binding.decksSharedViewModel = decksSharedViewModel

        binding.recyclerViewForDecks.adapter = DeckAdapter(deckList = decksSharedViewModel.deckList
        )
        binding.recyclerViewForDecks.layoutManager = GridLayoutManager(context, 2)


        binding.buttonAddDeck.setOnClickListener{
            findNavController().navigate(R.id.action_myDecksFragment_to_addDeckFragment)
        }
        return binding.root
    }


}