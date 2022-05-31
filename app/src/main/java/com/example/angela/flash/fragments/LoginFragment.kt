package com.example.angela.flash.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.angela.flash.R
import com.example.angela.flash.databinding.LoginFragmentBinding

class LoginFragment : Fragment(R.layout.login_fragment) {
    private lateinit var binding: LoginFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.login_fragment,
            container, false
        )
        binding.buttonLogin.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_myDecksFragment)
        }
        return binding.root
    }

}



