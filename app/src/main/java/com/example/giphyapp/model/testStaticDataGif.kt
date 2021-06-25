package com.example.giphyapp.model

data class testStaticDataGif(
    var title: String,
    var body: String,
    var image: String,
    var username: String

) {

    override fun toString(): String {
        return "BlogPost(title='$title', image='$image', username='$username')"
    }


}
