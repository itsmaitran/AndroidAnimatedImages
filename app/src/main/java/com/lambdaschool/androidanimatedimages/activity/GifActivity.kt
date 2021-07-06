package com.lambdaschool.androidanimatedimages.activity

import android.annotation.SuppressLint
import android.graphics.ImageDecoder
import android.graphics.drawable.AnimatedImageDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.androidanimatedimages.R
import kotlinx.android.synthetic.main.activity_gif.*

class GifActivity : AppCompatActivity() {

    @SuppressLint("WrongThread")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gif)

        // 1. An animated Gif (find a fun one online)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val gifDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(resources, R.drawable.dog_computer))
            iv_gif.setImageDrawable(gifDrawable)
            (gifDrawable as AnimatedImageDrawable).start()
        }
    }
}
