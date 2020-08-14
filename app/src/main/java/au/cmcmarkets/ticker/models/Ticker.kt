package au.cmcmarkets.ticker.models

import com.google.gson.annotations.SerializedName

// data class for parsing whole set of Ticker JSON
data class Ticker (
    @SerializedName("USD") var usd:TickerItem? = null,
    @SerializedName("AUD") var aud:TickerItem? = null,
    @SerializedName("BRL") var brl:TickerItem? = null,
    @SerializedName("CAD") var cad:TickerItem? = null,
    @SerializedName("CHF") var chf:TickerItem? = null,
    @SerializedName("CLP") var clp:TickerItem? = null,
    @SerializedName("CNY") var cny:TickerItem? = null,
    @SerializedName("DKK") var dkk:TickerItem? = null,
    @SerializedName("EUR") var eur:TickerItem? = null,
    @SerializedName("GBP") var gbp:TickerItem? = null,  // We will use this GBP item for demo
    @SerializedName("HKD") var hkd:TickerItem? = null,
    @SerializedName("INR") var inr:TickerItem? = null,
    @SerializedName("ISK") var isk:TickerItem? = null,
    @SerializedName("JPY") var jpy:TickerItem? = null,
    @SerializedName("KRW") var krw:TickerItem? = null,
    @SerializedName("NZD") var nzd:TickerItem? = null,
    @SerializedName("PLN") var pln:TickerItem? = null,
    @SerializedName("RUB") var rub:TickerItem? = null,
    @SerializedName("SEK") var sek:TickerItem? = null,
    @SerializedName("SGD") var sgd:TickerItem? = null,
    @SerializedName("THB") var thb:TickerItem? = null,
    @SerializedName("TRY") var `try`:TickerItem? = null,
    @SerializedName("TWD") var twd:TickerItem? = null
)

// data class for parsing one of Ticker item
data class TickerItem (
    @SerializedName("15m") var fifteenMin: String,
    var last: String,
    var buy: String,
    var sell: String,
    var symbol: String
)