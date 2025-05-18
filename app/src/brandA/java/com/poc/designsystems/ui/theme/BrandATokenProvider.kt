package com.poc.designsystems.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import com.poc.designsystem.tokens.colors.ColorPalette
import com.poc.designsystem.tokens.space.SpacingScale
import com.poc.designsystems.ui.theme.tokens.ColorTokensBrandA
import com.poc.designsystems.ui.theme.tokens.ShapeTokensBrandA
import com.poc.designsystems.ui.theme.tokens.SpacingTokensBrandA
import com.poc.designsystems.ui.theme.tokens.TypographyTokensBrandA

class BrandATokenProvider : BrandTokenProvider {
    override fun colors(): ColorScheme = ColorTokensBrandA.toColorScheme()

    override fun typography(): Typography = TypographyTokensBrandA.typography

    override fun shapes() = ShapeTokensBrandA.shapes
    override fun spacing(): SpacingScale = SpacingTokensBrandA

}

fun ColorPalette.toColorScheme(): ColorScheme = lightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    background = background,
    onBackground = onBackground,
    error = error,
    onError = onError
)