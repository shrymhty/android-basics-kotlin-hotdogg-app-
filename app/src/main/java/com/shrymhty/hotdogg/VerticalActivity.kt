package com.shrymhty.hotdogg

import android.os.Bundle
import com.shrymhty.hotdogg.layoutstuff.layout
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.ItemAdapter
import com.shrymhty.hotdogg.databinding.HorizontalLayoutBinding
import com.shrymhty.hotdogg.databinding.VerticalLayoutBinding

class VerticalActivity :AppCompatActivity() {

    lateinit var binding : VerticalLayoutBinding

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        binding = VerticalLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = ItemAdapter(applicationContext, layout.VERTICAL)

        binding.verticalRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}