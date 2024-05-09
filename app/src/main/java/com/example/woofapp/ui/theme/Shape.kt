package com.example.woofapp.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    // RoundedCornerShape(50.dp) => makes a circular border-radius
    small = RoundedCornerShape(50.dp),
    // custom border-radius for bottom-left & top-right corners only
    medium = RoundedCornerShape(bottomStart = 16.dp, topEnd = 16.dp)
)