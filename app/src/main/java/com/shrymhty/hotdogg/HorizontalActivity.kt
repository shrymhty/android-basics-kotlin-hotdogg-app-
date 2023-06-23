package com.shrymhty.hotdogg

import android.os.Bundle
import com.shrymhty.hotdogg.layoutstuff.layout
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.ItemAdapter
import com.shrymhty.hotdogg.databinding.HorizontalLayoutBinding

class HorizontalActivity : AppCompatActivity() {

    lateinit var binding : HorizontalLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = HorizontalLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = ItemAdapter(applicationContext, layout.HORIZONTAL)

        binding.horizontalRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}