package com.example.feature_cryptocurrencies.data.network

import com.example.feature_cryptocurrencies.data.model.CoinDto
import com.example.feature_cryptocurrencies.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header


/**
 * @author Kantemir Tatarkanov
 * 15.02.2023
 */
interface CoinApiService {
    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getCoins(@Header(Constants.API_HEADER) apiKey: String): List<CoinDto>

}