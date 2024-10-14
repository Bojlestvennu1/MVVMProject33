package com.example.mvvmproject
// Made by Temir and Daniar
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainScreen() {
    val counterViewModel: CounterViewModel = viewModel()
    var inputSeconds = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = counterViewModel.timeLeft.value.toString(), fontSize = 30.sp)


        TextField(
            value = inputSeconds.value,
            onValueChange = { inputSeconds.value = it },
            label = { Text("Секунды") },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )
        Row {
            Button(
                onClick = {

                    counterViewModel.startCountdown(inputSeconds.value.toIntOrNull() ?: 0)
                }
            ) {
                Text("Начать")
            }
        }
    }
}
