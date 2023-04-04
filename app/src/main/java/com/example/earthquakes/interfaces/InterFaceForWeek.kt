package com.example.earthquakes.interfaces

import com.example.earthquakes.helperClass.HelperClass
import retrofit2.Response
import retrofit2.http.GET

interface InterFaceForWeek {

     // 4.5+
    // https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_week.geojson

    @GET("feed/v1.0/summary/4.5_week.geojson")
    suspend fun getWeeklyUpdate() : Response<HelperClass>
}