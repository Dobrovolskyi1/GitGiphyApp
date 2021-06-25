package com.example.giphyapp.data

data class FixedHeight(
    val height: String,
    val width: String,
    val size: String,
    val url: String,
    val mp4Size: String? = null,
    val mp4: String? = null,
    val webpSize: String,
    val webp: String,
    val frames: String? = null,
    val hash: String? = null
)
