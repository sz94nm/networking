package com.example.sz94n.networking

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherInterface {
    @GET("location/{id}/")
fun getCityInfo(@Path("id")id:Int): Call<City>

    @GET("location/search/")
    fun searchForCity(@Query("query")searchQuery:String): Call<List<City>>
}