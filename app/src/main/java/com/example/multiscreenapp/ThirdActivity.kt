package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ThirdActivity", "onCreate")
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnForward = binding.btnGo
        btnForward.setOnClickListener { navigateForward() }

        val btnBack = binding.btnBack
        btnBack.setOnClickListener { navigateBack() }
    }

    private fun navigateForward() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateBack() {
       finish()
    }

    override fun onStart() {
        super.onStart()
        Log.i("ThirdActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("ThirdActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ThirdActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ThirdActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ThirdActivity", "onDestroy")
    }
}