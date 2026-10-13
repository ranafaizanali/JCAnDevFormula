package com.example.jcandevformula.c03_layouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SpacerExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "Faizan", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Rahul", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Rohit", fontSize = 24.sp)

    }

    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(text = "Faizan", fontSize = 24.sp)

        Spacer(modifier = Modifier.width(24.dp))

        Text(text = "Rahul", fontSize = 24.sp)

        Spacer(modifier = Modifier.width(24.dp))

        Text(text = "Rohit", fontSize = 24.sp)

    }

}