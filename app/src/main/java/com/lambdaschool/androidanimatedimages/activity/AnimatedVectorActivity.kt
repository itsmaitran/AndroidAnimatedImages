package com.lambdaschool.androidanimatedimages.activity

import android.graphics.drawable.Animatable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.lambdaschool.androidanimatedimages.R
import kotlinx.android.synthetic.main.activity_animated_vector.*

class AnimatedVectorActivity : AppCompatActivity() {

    var click = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated_vector)

        // 3. A button animated with an animated vector drawable that animates between two states when pressed (you'll need a button with 2 states and 2 animates, one for A to B and one for B to A)
        val animatedVectorDrawable = ContextCompat.getDrawable(this, R.drawable.avd_playtopause)
        iv_vector.setImageDrawable(animatedVectorDrawable)
        (animatedVectorDrawable as Animatable).start()

        iv_vector.setOnClickListener {
            if (click == 0) {
                val animatedVectorDrawable =
                    ContextCompat.getDrawable(this, R.drawable.avd_pausetoplay)
                iv_vector.setImageDrawable(animatedVectorDrawable)
                (animatedVectorDrawable as Animatable).start()
                click++
            } else {
                val vector = ContextCompat.getDrawable(this, R.drawable.avd_playtopause)
                iv_vector.setImageDrawable(animatedVectorDrawable)
                (animatedVectorDrawable as Animatable).start()
                click--
            }
        }
    }
}
