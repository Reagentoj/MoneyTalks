package com.example.feature_cryptocurrencies.data.repository

import com.example.feature_cryptocurrencies.data.model.CoinDto
import com.example.feature_cryptocurrencies.data.network.CoinApiService
import com.example.feature_cryptocurrencies.domain.repository.CoinRepository
import com.example.feature_cryptocurrencies.utils.Constants
import javax.inject.Inject


/**
 * @author Kantemir Tatarkanov
 * 17.02.2023
 */
class CoinRepositoryImpl @Inject constructor(private val api: CoinApiService): CoinRepository{
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins(Constants.API_KEY)
    }

}