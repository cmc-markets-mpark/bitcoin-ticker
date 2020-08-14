package au.cmcmarkets.ticker.data.api

import au.cmcmarkets.ticker.models.Ticker
import retrofit2.Response
import retrofit2.http.GET

interface BitcoinApi {

    //DONE. Bitcoin api here
    // use coroutine to get ticker
    @GET("/ticker")
    suspend fun getTickerResponse(): Response<Ticker>
}