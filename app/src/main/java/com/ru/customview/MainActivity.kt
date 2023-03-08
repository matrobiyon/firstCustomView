package com.ru.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ru.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1
        binding.happyButton.setOnClickListener {
            binding.emotionalFaceView.happinessState = EmotionalFace.HAPPY
        }
// 2
        binding.sadButton.setOnClickListener {
            binding.emotionalFaceView.happinessState = EmotionalFace.SAD
        }

    }
}