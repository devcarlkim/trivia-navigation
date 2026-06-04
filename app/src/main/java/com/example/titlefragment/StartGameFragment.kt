package com.example.titlefragment
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
class StartGameFragment : Fragment(R.layout.fragment_start_game) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.btn_win).setOnClickListener {
            findNavController().navigate(R.id.action_startGameFragment_to_gameWonFragment)
        }
        view.findViewById<View>(R.id.btn_lose).setOnClickListener {
            findNavController().navigate(R.id.action_startGameFragment_to_gameOverFragment)
        }
    }
}
