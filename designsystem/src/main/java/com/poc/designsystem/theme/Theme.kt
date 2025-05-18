package com.poc.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.poc.designsystem.tokens.colors.ColorPalette
import com.poc.designsystem.tokens.colors.ColorTokens
import com.poc.designsystem.tokens.shapes.ShapePalette
import com.poc.designsystem.tokens.shapes.ShapeTokens
import com.poc.designsystem.tokens.typography.TypographyPalette
import com.poc.designsystem.tokens.typography.TypographyTokens

@Composable
fun AppThemeDesignSystem(
    useDarkTheme: Boolean = false,
    colorTokens: ColorPalette = ColorTokens,
    typographyTokens: TypographyPalette = TypographyTokens,
    shapeTokens: ShapePalette = ShapeTokens,
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) {
        lightColorScheme(
            primary = colorTokens.primary,
            onPrimary = colorTokens.onPrimary,
            secondary = colorTokens.secondary,
            onSecondary = colorTokens.onSecondary,
            background = colorTokens.background,
            onBackground = colorTokens.onBackground,
            error = colorTokens.error,
            onError = colorTokens.onError
        )
    } else {
        lightColorScheme(
            primary = colorTokens.primary,
            onPrimary = colorTokens.onPrimary,
            secondary = colorTokens.secondary,
            onSecondary = colorTokens.onSecondary,
            background = colorTokens.background,
            onBackground = colorTokens.onBackground,
            error = colorTokens.error,
            onError = colorTokens.onError
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typographyTokens.typography,
        shapes = shapeTokens.shapes,
        content = content
    )
}

