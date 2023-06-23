package com.shrymhty.hotdogg.model

import androidx.annotation.DrawableRes

data class DogModel(@DrawableRes val imageID: Int,
                    val name : String,
                    val age : String,
                    val hobbies : String)