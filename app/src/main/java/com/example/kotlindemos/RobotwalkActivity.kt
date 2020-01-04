package com.example.kotlindemos

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_robotwalk.*

class RobotwalkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robotwalk)

        startWalking.setOnClickListener {
            val bgImage = imageView.background as AnimationDrawable
            bgImage.start()
        }

        stopWalking.setOnClickListener {
            val bgImage = imageView.background as AnimationDrawable
            bgImage.stop()
        }
    }
}
