package com.lambdaschool.androidanimatedimages.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.androidanimatedimages.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iv_animate_gif.setOnClickListener {
            intent = Intent(this, GifActivity::class.java)
            startActivity(intent)
        }

        iv_animation_drawable.setOnClickListener {
            intent = Intent(this, AnimatedDrawableActivity::class.java)
            startActivity(intent)
        }

        iv_animation_vector.setOnClickListener {
            intent = Intent(this, AnimatedVectorActivity::class.java)
            startActivity(intent)
        }
    }
}
