package com.example.jcandevformula.c8_dividers

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VerticalDividerExample() {

    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Faizan Ali",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        VerticalDivider(
            modifier = Modifier
                .height(40.dp)
                .padding(horizontal = 16.dp),
            thickness = 4.dp,
            color = Color.Red
        )

        Text(
            text = "Neat Roots",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

    }

}