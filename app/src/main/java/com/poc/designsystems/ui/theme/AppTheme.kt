package com.poc.designsystems.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.poc.designsystem.tokens.space.LocalSpacing

@Composable
fun AppTheme(
    useDarkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val brandTokens = createBrandProvider()
    CompositionLocalProvider(
        LocalSpacing provides brandTokens.spacing()
    ) {
        MaterialTheme(
            colorScheme = brandTokens.colors(),     // Brand-specific colors
            typography = brandTokens.typography(),  // Typography (can remain shared)
            shapes = brandTokens.shapes(),          // Shape tokens (can remain shared)
            content = content
        )
    }
}