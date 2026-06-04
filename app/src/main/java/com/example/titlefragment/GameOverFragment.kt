package com.example.titlefragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class GameOverFragment : Fragment(R.layout.fragment_game_over) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btn_try_again).setOnClickListener {
            findNavController().navigate(R.id.action_gameOverFragment_to_startGameFragment)
        }
    }
}

