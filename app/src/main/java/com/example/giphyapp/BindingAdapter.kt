package com.example.giphyapp
import android.widget.ImageView
import com.bumptech.glide.Glide

object BindingAdapter {


    @BindingAdapter("imageUrl")
    fun loadImage(imageView: ImageView, url: String?) {
        if (!url.isNullOrEmpty()) {
            Glide.with(imageView).load(url).into(imageView)
        }
    }
}