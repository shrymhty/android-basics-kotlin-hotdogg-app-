package com.shrymhty.hotdogg.data

import com.shrymhty.hotdogg.R
import com.shrymhty.hotdogg.model.DogModel

object DataSource {
    val dogs : List<DogModel> = listOf(
        DogModel(R.drawable.bruno, "Bruno", "4", "Loves running behind tennis balls"),
        DogModel(R.drawable.ella, "Ella", "7", "Sunbathing"),
        DogModel(R.drawable.cookie, "Cookie", "2", "Running through people's hair"),
        DogModel(R.drawable.gerald, "Gerald", "9", "Chasing birds away"),
        DogModel(R.drawable.stella, "Stella", "8", "Digging the garden")
    )
}