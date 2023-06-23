package com.shrymhty.hotdogg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.shrymhty.hotdogg.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalLayout.setOnClickListener() {
            callHorizontal()
        }

        binding.verticalLayout.setOnClickListener() {
            callVertical()
        }

        binding.gridLayout.setOnClickListener() {
            callGrid()
        }

    }

     private fun callHorizontal() {
        listIntent = Intent(this, HorizontalActivity::class.java)
        startActivity(listIntent)
    }

    private fun callVertical() {
        listIntent = Intent(this, VerticalActivity::class.java)
        startActivity(listIntent)
    }

    private fun callGrid() {
        listIntent = Intent(this, GridActivity::class.java)
        startActivity(listIntent)
    }
}