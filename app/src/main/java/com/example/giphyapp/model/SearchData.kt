package com.example.giphyapp.model

import com.google.gson.annotations.SerializedName

data class SearchData(
    @SerializedName("data")
    val data : List<Data>
)
