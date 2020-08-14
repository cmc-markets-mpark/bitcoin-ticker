package au.cmcmarkets.ticker.repository

import au.cmcmarkets.ticker.models.Ticker

sealed class TickerData {
    data class Success(val ticker : Ticker) : TickerData()
    data class Failure(val exception : String) : TickerData()
}