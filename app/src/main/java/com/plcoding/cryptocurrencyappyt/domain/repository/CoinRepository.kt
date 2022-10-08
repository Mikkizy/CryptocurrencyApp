package com.plcoding.cryptocurrencyappyt.domain.repository

import com.plcoding.cryptocurrencyappyt.data.data_transfer_object.CoinDTO
import com.plcoding.cryptocurrencyappyt.data.data_transfer_object.CoinDetailDTO

interface CoinRepository {
    suspend fun getCoins() : List<CoinDTO>

    suspend fun getCoinById(coinId: String) : CoinDetailDTO
}