package com.example.jcandevformula.c03_layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BoxExample() {

    Box(
        modifier = Modifier
            .size(300.dp)
            .background(color = Color.Red, shape = RoundedCornerShape(16.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = "Faizan",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.TopCenter)
        )

        Text(
            text = "Rahul",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.CenterStart)
        )

        Text(
            text = "Rohit",
            fontSize = 24.sp,
            modifier = Modifier.align(Alignment.BottomEnd)
        )

    }

}