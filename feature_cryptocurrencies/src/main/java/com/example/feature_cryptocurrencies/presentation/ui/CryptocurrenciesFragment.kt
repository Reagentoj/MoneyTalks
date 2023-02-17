package com.example.feature_cryptocurrencies.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.feature_cryptocurrencies.R
import com.example.feature_cryptocurrencies.databinding.FragmentCryptocurrenciesBinding


/**
 * @author Kantemir Tatarkanov
 * 11.02.2023
 */
class CryptocurrenciesFragment : Fragment() {

    private var _binding: FragmentCryptocurrenciesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCryptocurrenciesBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        binding.addTransaction.setOnClickListener{navController.navigate(R.id.searchFragment)}
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}