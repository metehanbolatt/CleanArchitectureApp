package com.metehanbolat.data.extensions

import com.metehanbolat.data.model.CoinModel
import com.metehanbolat.domain.model.Coin

fun CoinModel.toCoin(): Coin {
    return Coin(
        id, isActive, name, rank, symbol
    )
}