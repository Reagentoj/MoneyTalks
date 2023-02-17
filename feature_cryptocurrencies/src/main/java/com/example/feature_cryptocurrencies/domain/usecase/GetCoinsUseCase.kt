package com.example.feature_cryptocurrencies.domain.usecase

import com.example.feature_cryptocurrencies.data.model.CoinDto
import com.example.feature_cryptocurrencies.domain.repository.CoinRepository
import com.example.feature_cryptocurrencies.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


/**
 * @author Kantemir Tatarkanov
 * 17.02.2023
 */
class GetCoinsUseCase @Inject constructor(private val repository: CoinRepository){
    fun execute(): Flow<Resource<List<CoinDto>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins()
            emit(Resource.Success(coins))
        } catch (e: HttpException){
            emit(Resource.Error(e.localizedMessage ?: "Error"))
        } catch (e: IOException){
            emit(Resource.Error("Internet connection error"))
        }
    }
}