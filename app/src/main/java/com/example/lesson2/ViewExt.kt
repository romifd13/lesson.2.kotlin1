package com.example.lesson2

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun View.downloadImage(image: String) {
    Glide.with(this).load(image).into(this as  ImageView)
}