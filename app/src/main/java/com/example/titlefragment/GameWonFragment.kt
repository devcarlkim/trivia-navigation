package com.example.titlefragment
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
class GameWonFragment : Fragment(R.layout.fragment_game_won) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.btn_play_again_won).setOnClickListener {
            findNavController().navigate(R.id.action_gameWonFragment_to_startGameFragment)
        }
    }
}
