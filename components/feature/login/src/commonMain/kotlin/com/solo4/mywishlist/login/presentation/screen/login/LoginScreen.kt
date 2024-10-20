package com.solo4.mywishlist.login.presentation.screen.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier.padding(all = 16.dp).fillMaxSize()
    ) {
        val viewModel = koinViewModel<LoginViewModel>()
        val state = viewModel.state.collectAsState()

        Text(text = "Hello! Enter your nickname")
        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            value = state.value.model.nickname,
            onValueChange = viewModel::onNicknameFieldUpdated
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {}
        ) {
            Text(text = "Enter")
        }
    }
}