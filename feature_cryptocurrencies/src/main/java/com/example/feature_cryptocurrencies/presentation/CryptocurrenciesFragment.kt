package com.example.feature_cryptocurrencies.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.feature_cryptocurrencies.R
import com.example.feature_cryptocurrencies.databinding.FragmentCryptocurrenciesBinding


class CryptocurrenciesFragment : Fragment() {

    private var _binding: FragmentCryptocurrenciesBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCryptocurrenciesBinding.inflate(inflater, container, false)
        binding.addTransaction.setOnClickListener{}


        return binding.root
    }

}