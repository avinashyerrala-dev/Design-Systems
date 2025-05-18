package com.poc.playground

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.poc.designsystem.atoms.AppButton
import com.poc.designsystem.atoms.AppTextInput
import com.poc.designsystem.organisms.ProfileCard
import com.poc.designsystem.theme.AppThemeDesignSystem

@Composable
fun MainScreen() {
    AppThemeDesignSystem {

        Column(modifier = Modifier.fillMaxSize()) {

            AppButton(text = "Buy Now", onClick = {})
            var text by remember { mutableStateOf("") }

            AppTextInput(
                value = text,
                onValueChange = { text = it },
                label = "Your name",
                modifier = Modifier.fillMaxWidth()
            )
            ProfileCard(
                onSubmit = { name, email ->
                    println("Name: $name, Email: $email")
                }
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    AppThemeDesignSystem {
        MainScreen()
    }
}