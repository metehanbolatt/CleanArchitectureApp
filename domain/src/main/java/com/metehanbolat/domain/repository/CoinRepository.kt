package com.metehanbolat.domain.repository

import com.metehanbolat.domain.model.Coin

interface CoinRepository {
    suspend fun getCoins(): List<Coin>
}