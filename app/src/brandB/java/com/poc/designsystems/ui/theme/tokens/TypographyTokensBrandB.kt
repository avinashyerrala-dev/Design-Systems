package com.poc.designsystems.ui.theme.tokens

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.poc.designsystem.tokens.typography.TypographyPalette

object TypographyTokensBrandB : TypographyPalette{
    override val typography = Typography(
        bodyLarge = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        ),
        titleLarge = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    )
}
