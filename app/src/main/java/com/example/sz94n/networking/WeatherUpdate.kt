package com.example.sz94n.networking

import com.google.gson.annotations.SerializedName

class WeatherUpdate {
    @SerializedName("weather_starte_name")
    var weatherStateName:String=""
    @SerializedName("the_temp")
    var theTemp:Float=0f
    var humidity:Float=0f
}