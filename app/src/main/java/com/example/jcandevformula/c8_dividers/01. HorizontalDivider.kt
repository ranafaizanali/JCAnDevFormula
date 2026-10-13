package com.example.jcandevformula.c8_dividers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HorizontalDividerExample() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Faizan Ali",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        HorizontalDivider(
            modifier = Modifier
                .width(150.dp)
                .padding(vertical = 16.dp),
            thickness = 6.dp,
            color = Color.Blue
        )

        Text(
            text = "Neat Roots",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

    }

}