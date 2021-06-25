package com.example.giphyapp.model

import com.example.giphyapp.data.Images
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("images")
    val images: Images,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("username")
    val username: String

)
