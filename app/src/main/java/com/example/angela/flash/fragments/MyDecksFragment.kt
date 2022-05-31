package com.example.angela.flash.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.angela.flash.R
import com.example.angela.flash.databinding.MyDecksFragmentBinding

class MyDecksFragment : Fragment(R.layout.my_decks_fragment){
    private lateinit var binding: MyDecksFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.my_decks_fragment,
            container, false
        )
        return binding.root
    }
}