package com.example.angela.flash

import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   // private var recyclerView: RecyclerView? = null
   // private lateinit var deckAdapter: DeckAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = ContextCompat.getColor(this, R.color.background_purple)
        supportActionBar?.setTitle("")
        supportActionBar?.elevation = 0f
        supportActionBar?.setBackgroundDrawable(
            ColorDrawable(
                ContextCompat.getColor(
                    this,
                    R.color.background_purple
                )
            )
        )

        setContentView(R.layout.activity_main)
    }


}