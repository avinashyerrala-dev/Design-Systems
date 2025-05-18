package com.poc.designsystem.tokens.space

import androidx.compose.runtime.staticCompositionLocalOf

val LocalSpacing = staticCompositionLocalOf<SpacingScale> {
    error("No SpacingScale provided")
}
