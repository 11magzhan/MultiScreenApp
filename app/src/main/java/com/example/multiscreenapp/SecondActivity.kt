package com.example.multiscreenapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiscreenapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("SecondActivity", "onCreate")
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnForward = binding.btnGo
        btnForward.setOnClickListener { navigateForward() }

        val btnBack = binding.btnBack
        btnBack.setOnClickListener { navigateBack() }
    }

    private fun navigateForward() {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }

    private fun navigateBack() {
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.i("SecondActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("SecondActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("SecondActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("SecondActivity", "onStop"
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("SecondActivity", "onDestroy")
    }
}