package com.poc.designsystem.tokens.typography

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object TypographyTokens : TypographyPalette {
    override val typography = Typography(
        bodyLarge = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal
        ),
        titleLarge = TextStyle(
            fontSize = 22.sp,
            fontWeight = FontWeight.SemiBold
        )
    )
}
