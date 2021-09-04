package com.example.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private var list = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addImage()
        submitImage()
        randomImage()
    }

    private fun randomImage() {
        btn_2.setOnClickListener {
            iv_url.downloadImage(list.random())
        }

    }

    private fun submitImage() {
        Button_1.setOnClickListener {
            list.add(ed_text.text.toString())
            iv_url.downloadImage(ed_text.text.toString())
        }
    }

    private fun addImage() {
        list.add("https://cdn.arstechnica.net/wp-content/uploads/2016/02/5718897981_10faa45ac3_b-640x624.jpg")
        list.add("https://thumbs.dreamstime.com/z/cosmos-beauty-deep-space-elements-image-furnished-nasa-science-fiction-art-102581846.jpg")
        list.add("https://st2.depositphotos.com/1064024/10769/i/600/depositphotos_107694484-stock-photo-little-boy.jpg")
        list.add("https://cdn.jpegmini.com/user/images/slider_puffin_before_mobile.jpg")
        list.add("https://cdn.searchenginejournal.com/wp-content/uploads/2019/08/c573bf41-6a7c-4927-845c-4ca0260aad6b-760x400.jpeg")

    }
}