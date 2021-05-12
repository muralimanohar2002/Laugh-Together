package com.example.memology

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.memology.databinding.ActivitySplashScreenBinding

@Suppress("UsePropertyAccessSyntax")
class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.memo.animate().translationY(1400F).setDuration(1000).setStartDelay(4000)
        binding.lottie.animate().translationY(1400F).setDuration(1000).setStartDelay(4000)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 5000)
    }
}