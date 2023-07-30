package com.example.superheroesapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroesapp.R

// Set of Material typography styles to start with
val CabinBold = FontFamily(
    Font(R.font.cabin_bold)
)

val CabinRegular = FontFamily(
    Font(R.font.cabin_regular)
)


val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = CabinBold,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodySmall = TextStyle(
        fontFamily = CabinRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
    )
)