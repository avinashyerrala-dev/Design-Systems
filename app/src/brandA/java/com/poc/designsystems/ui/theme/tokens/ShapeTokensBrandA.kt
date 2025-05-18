package com.poc.designsystems.ui.theme.tokens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp
import com.poc.designsystem.tokens.shapes.ShapePalette

object ShapeTokensBrandA : ShapePalette{
    private val roundedSmall = RoundedCornerShape(4.dp)
    private val roundedMedium = RoundedCornerShape(8.dp)
    private val roundedLarge = RoundedCornerShape(16.dp)

   override val shapes = Shapes(
        small = roundedSmall,
        medium = roundedMedium,
        large = roundedLarge
    )
}
