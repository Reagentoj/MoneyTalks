package com.example.feature_cryptocurrencies.domain.repository

import com.example.feature_cryptocurrencies.data.model.CoinDto


/**
 * @author Kantemir Tatarkanov
 * 17.02.2023
 */
interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
}