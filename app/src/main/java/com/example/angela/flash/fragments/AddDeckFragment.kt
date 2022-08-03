package com.example.angela.flash.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.angela.flash.Deck
import com.example.angela.flash.DeckAdapter
import com.example.angela.flash.DecksSharedViewModel
import com.example.angela.flash.R
import com.example.angela.flash.databinding.AddDeckFragmentBinding

class AddDeckFragment : Fragment(R.layout.add_deck_fragment){
    private lateinit var binding: AddDeckFragmentBinding
    private lateinit var decksSharedViewModel: DecksSharedViewModel




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.add_deck_fragment,
            container, false
        )
        decksSharedViewModel = ViewModelProvider(requireActivity()).get(DecksSharedViewModel::class.java)

     //   var adapter = DeckAdapter(decksSharedViewModel.deckList)

        binding.buttonSaveNewDeck.setOnClickListener{
            var deck = Deck()
            deck.titleText = binding.enterDeckTitleBox.text.toString()
           // deck.color = binding.enterDeckColorBox.text.toString()
            decksSharedViewModel.addNewDeck(deck)

          //  adapter.setData(decksSharedViewModel.deckList)
            findNavController().navigate(R.id.action_addDeckFragment_to_myDecksFragment)
           // adapter.setData(decksSharedViewModel.deckList)

        }
     return binding.root
    }


}