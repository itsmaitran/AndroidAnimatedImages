package com.lambdaschool.androidanimatedimages.activity

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.lambdaschool.androidanimatedimages.R
import kotlinx.android.synthetic.main.activity_animated_drawable.*

class AnimatedDrawableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated_drawable)

        // 2. An animated drawable (find a gif and use a site like this, to split up and download the frames
        val frameDrawable = ContextCompat.getDrawable(this, R.drawable.computer_animated)
        iv_animated_drawable.setImageDrawable(frameDrawable)
        (frameDrawable as AnimationDrawable).start()
    }
}
