package au.cmcmarkets.ticker.repository

interface TickerRepository {
    suspend fun getTicker(): TickerData
}