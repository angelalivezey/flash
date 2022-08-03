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
    private lateinit var deckAdapter: DeckAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.my_decks_fragment,
            container, false
        )
        // This needed to be changed to requireActivity() instead of "this". Otherwise there are two different instances
        // of the decksSharedViewModel. DeckSharedViewModel needs to share the same owner which in this case can be the activity.
        decksSharedViewModel = ViewModelProvider(requireActivity()).get(DecksSharedViewModel::class.java)
        binding.decksSharedViewModel = decksSharedViewModel

        deckAdapter = DeckAdapter(deckList = decksSharedViewModel.deckList)
        binding.recyclerViewForDecks.adapter = deckAdapter
        binding.recyclerViewForDecks.layoutManager = GridLayoutManager(context, 2)


        binding.buttonAddDeck.setOnClickListener{
            findNavController().navigate(R.id.action_myDecksFragment_to_addDeckFragment)
        }
        return binding.root
    }

    // When I switch screens, navigating from Add Deck to My Decks, OnResume is called.
    // That is where we call the deckAdapter instantiated and connected above with .setData.
    // .setData compares the old list to the new list and refreshes the view with what is different .
    // AKA Diff Util Stuff.
    override fun onResume() {
       deckAdapter.setData(decksSharedViewModel.deckList)
        super.onResume()
    }


}