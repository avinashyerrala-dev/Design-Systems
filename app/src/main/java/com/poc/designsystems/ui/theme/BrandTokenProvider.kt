package com.poc.designsystems.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.material3.Shapes
import com.poc.designsystem.tokens.space.SpacingScale

interface BrandTokenProvider {
    fun colors(): ColorScheme
    fun typography(): Typography
    fun shapes(): Shapes
    fun spacing(): SpacingScale

}
