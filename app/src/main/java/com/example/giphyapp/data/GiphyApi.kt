package com.example.giphyapp.data

import com.example.giphyapp.model.SearchData
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface GiphyApi {
    @GET("v1/gifs/search")
    fun getContent(
        @Query("api_key") api_key : String = "znnEAvA7eoKnlpuuSuLj8PeFMr0Ecl8s",
        @Query("limit") limit: Int= 25,
        @Query("offset") offset : Int = 0,
        @Query("rating") rating : String = "g",
        @Query("lang") lang:String = "en"
    ): Flowable<SearchData>
}