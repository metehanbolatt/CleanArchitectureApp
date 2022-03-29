package com.metehanbolat.cleanarchitectureapp.model

import com.metehanbolat.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
