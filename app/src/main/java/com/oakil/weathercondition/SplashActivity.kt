package com.oakil.weathercondition

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import android.view.animation.TranslateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Enable edge-to-edge support
        setContentView(R.layout.activity_splash)

        // Find views by their IDs
        val imageView = findViewById<ImageView>(R.id.imageView)
        val textViewTop = findViewById<TextView>(R.id.textView)
        val textViewBottom = findViewById<TextView>(R.id.textView2)

        // Slide-down animation for the ImageView
//        val slideDownImage = TranslateAnimation(200f, 0f, 200f, 0f).apply {
//            duration = 1500 // Duration in milliseconds
//            fillAfter = true // Keep the end state after animation
//        }

        val slideDownImage = TranslateAnimation(-220f, 0f, 200f, 0f).apply {
            duration = 1500
            fillAfter = true
        }

        // Slide-up animation for the top TextView
        val slideUpTop = TranslateAnimation(200f, 0f, 200f, 0f).apply {
            duration = 1500 // Duration in milliseconds
            fillAfter = true // Keep the end state after animation
        }

        // Slide-up animation for the bottom TextView (designer credit)
        val slideUpBottom = TranslateAnimation(0f, 0f, 300f, 0f).apply {
            duration = 1500 // Duration in milliseconds
            fillAfter = true // Keep the end state after animation
        }

        // Start the animations
        imageView.startAnimation(slideDownImage)
        textViewTop.startAnimation(slideUpTop)
        textViewBottom.startAnimation(slideUpBottom)

        // Start MainActivity after the animations are complete
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // Delay for 3 seconds to allow animations to complete
    }
}
