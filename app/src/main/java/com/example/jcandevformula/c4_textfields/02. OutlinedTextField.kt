package com.example.jcandevformula.c4_textfields

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun OutlinedTextFieldExample() {

    var username by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            // label = { Text("Username") },
            placeholder = { Text("Username") },
            leadingIcon = { Text("*") },
            trailingIcon = { Text("#") },
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.Red,
                unfocusedContainerColor = Color.Gray,
                focusedLeadingIconColor = Color.White,
                unfocusedLeadingIconColor = Color.Black,
                focusedTrailingIconColor = Color.White,
                unfocusedTrailingIconColor = Color.Black,
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.Black,
                focusedPlaceholderColor = Color.White,
                unfocusedPlaceholderColor = Color.Black,
                cursorColor = Color.White,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.Black,
                focusedBorderColor = Color.Green,
                unfocusedBorderColor = Color.Red
            )
        )

    }

}