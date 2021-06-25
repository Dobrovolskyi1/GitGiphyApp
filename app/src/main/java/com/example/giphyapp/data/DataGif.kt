package com.example.giphyapp.data

data class DataGif(
    val type: String,
    val id: String,
    val slug: String,
    val url: String,
    val bitlyUrl: String,
    val embedUrl: String,
    val username: String,
    val source: String,
    val rating: String,
    val contentUrl: String,
    val user: User,
    val sourceTld: String,
    val sourcePostUrl: String,
    val updateDataTime: String,
    val createDataTime: String,
    val importDatatime: String,
    val trendingDataTime: String,
    val images: Images,
    val title: String
)
