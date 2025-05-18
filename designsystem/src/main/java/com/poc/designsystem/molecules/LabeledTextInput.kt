package com.poc.designsystem.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.poc.designsystem.atoms.AppTextInput
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import com.poc.designsystem.atoms.AppText
import com.poc.designsystem.tokens.space.LocalSpacing
import com.poc.designsystem.tokens.space.SpacingTokens

@Composable
fun LabeledTextInput(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        val spacing = LocalSpacing.current
        AppText(
            text = label,
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.padding(bottom = spacing.xs)
        )
        AppTextInput(
            value = value,
            onValueChange = onValueChange,
            label = label,
            modifier = Modifier
        )
    }
}
