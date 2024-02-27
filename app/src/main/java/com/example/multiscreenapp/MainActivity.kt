package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate")
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

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
    }
}