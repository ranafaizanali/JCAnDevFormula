package com.example.jcandevformula.c13_toastandsnackbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.launch

@Composable
fun SnackBarExample() {

    val snackBarHostState = remember { SnackbarHostState() }

    val scope = rememberCoroutineScope()

    Scaffold(
        snackbarHost = { SnackbarHost(snackBarHostState) }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {

            Button(
                onClick = {
                    scope.launch {

                        snackBarHostState.showSnackbar(
                            message = "This is a SnackBar Message!",
                            actionLabel = "UNDO",
                            duration = SnackbarDuration.Indefinite,
                            withDismissAction = true
                        )

                    }
                }
            ) {
                Text(text = "Show SnackBar")
            }
        }

    }

}