package com.example.sz94n.networking

import com.google.gson.annotations.SerializedName

class City {
    var title =""
    var timezone = ""
    @SerializedName("consolidated_weather")
    var weather:List<WeatherUpdate> =listOf()
    @SerializedName("woeid")
    var id:Int=0

}