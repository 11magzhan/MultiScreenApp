package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnForward = binding.btnGo
        btnForward.setOnClickListener { navigateForward() }

        val btnBack = binding.btnBack
        btnBack.setOnClickListener { navigateBack() }
    }

    private fun navigateForward() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    private fun navigateBack() {
        finish()
    }
}