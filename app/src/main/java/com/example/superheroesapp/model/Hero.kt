package com.example.superheroesapp.model

import androidx.annotation.DrawableRes

data class Hero(
    val name: String,
    val description: String,
    @DrawableRes val profile: Int,
)
