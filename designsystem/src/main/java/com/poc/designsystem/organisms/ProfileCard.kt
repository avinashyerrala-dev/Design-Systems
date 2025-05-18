package com.poc.designsystem.organisms

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.poc.designsystem.atoms.AppCard
import com.poc.designsystem.atoms.AppButton
import com.poc.designsystem.molecules.LabeledTextInput
import com.poc.designsystem.tokens.space.LocalSpacing

@Composable
fun ProfileCard(
    onSubmit: (name: String, email: String) -> Unit,
    modifier: Modifier = Modifier
) {
    val spacing = LocalSpacing.current
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    AppCard(modifier = modifier.padding(spacing.m)) {
        Column(modifier = Modifier.padding(spacing.m)) {
            LabeledTextInput(
                label = "Name",
                value = name,
                onValueChange = { name = it },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(spacing.s))
            LabeledTextInput(
                label = "Email",
                value = email,
                onValueChange = { email = it },
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(spacing.m))
            AppButton(
                text = "Submit",
                onClick = { onSubmit(name, email) },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
