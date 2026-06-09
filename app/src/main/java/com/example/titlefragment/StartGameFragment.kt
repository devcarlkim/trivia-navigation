package com.example.titlefragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class StartGameFragment : Fragment(R.layout.fragment_start_game) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionMenu()
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun setHasOptionMenu() {
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.start_game_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_item_1, R.id.menu_item_2, R.id.menu_item_3 -> {
                Toast.makeText(requireContext(), item.title, Toast.LENGTH_SHORT).show()
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

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
