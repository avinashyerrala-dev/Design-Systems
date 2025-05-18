package com.poc.designsystems.ui.theme

import androidx.compose.material3.lightColorScheme
import com.poc.designsystem.tokens.space.SpacingScale
import com.poc.designsystems.ui.theme.tokens.ColorTokensBrandB
import com.poc.designsystems.ui.theme.tokens.ShapeTokensBrandB
import com.poc.designsystems.ui.theme.tokens.SpacingTokensBrandB
import com.poc.designsystems.ui.theme.tokens.TypographyTokensBrandB

class BrandBTokenProvider : BrandTokenProvider {
    override fun colors() = lightColorScheme(
        primary = ColorTokensBrandB.primary,
        onPrimary = ColorTokensBrandB.onPrimary,
        background = ColorTokensBrandB.background,
        onBackground = ColorTokensBrandB.onBackground,
        secondary = ColorTokensBrandB.secondary,
        onSecondary = ColorTokensBrandB.onSecondary,
        error = ColorTokensBrandB.error,
        onError = ColorTokensBrandB.onError,
    )

    override fun typography() = TypographyTokensBrandB.typography

    override fun shapes() = ShapeTokensBrandB.shapes
    override fun spacing(): SpacingScale = SpacingTokensBrandB


}
