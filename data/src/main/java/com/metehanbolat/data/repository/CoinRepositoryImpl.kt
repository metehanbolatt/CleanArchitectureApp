package com.metehanbolat.data.repository

import com.metehanbolat.data.api.CoinPaprikaApi
import com.metehanbolat.data.extensions.toCoin
import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map { it.toCoin() }
    }
}