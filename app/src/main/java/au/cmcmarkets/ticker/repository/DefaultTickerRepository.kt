package au.cmcmarkets.ticker.repository

import au.cmcmarkets.ticker.data.api.BitcoinApi

/**
 * This class is a repository for retrieving Ticker data.
 * Use only remote APIs without local repository for demo.
 */
class DefaultTickerRepository(val bitcoinApi: BitcoinApi): TickerRepository {

    override suspend fun getTicker(): TickerData {
        TODO("Not yet implemented")
    }
}