package com.shrymhty.hotdogg

import android.os.Bundle
import com.shrymhty.hotdogg.layoutstuff.layout
import androidx.appcompat.app.AppCompatActivity
import com.example.dogglers.adapter.ItemAdapter
import com.shrymhty.hotdogg.databinding.GridLayoutBinding
import com.shrymhty.hotdogg.databinding.HorizontalLayoutBinding
import com.shrymhty.hotdogg.databinding.VerticalLayoutBinding

class GridActivity : AppCompatActivity() {

    lateinit var binding : GridLayoutBinding

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        binding = GridLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = ItemAdapter(applicationContext, layout.GRID)

        binding.gridRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}