package com.poc.designsystems

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.poc.designsystem.atoms.AppButton
import com.poc.designsystem.atoms.AppText
import com.poc.designsystem.atoms.AppTextInput
import com.poc.designsystem.organisms.ProfileCard
import com.poc.designsystem.tokens.space.SpacingTokens
import com.poc.designsystems.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    AppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
            ) {
                AppText(
                    text = "============ Tokens examples ========",
                    modifier = Modifier
                        .padding(SpacingTokens.m)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                AppButton(
                    text = "Buy Now",
                    onClick = {},
                    modifier = Modifier.fillMaxWidth()
                )
                var text by remember { mutableStateOf("") }

                AppTextInput(
                    value = text,
                    onValueChange = { text = it },
                    label = "Your name",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = SpacingTokens.m)
                )
                AppText(
                    text = "===== Molecule Organism example =====",
                    modifier = Modifier
                        .padding(SpacingTokens.m)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                ProfileCard(
                    onSubmit = { name, email ->
                        println("Name: $name, Email: $email")
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    AppTheme {
        MainScreen()
    }
}
