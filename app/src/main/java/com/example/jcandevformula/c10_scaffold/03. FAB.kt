package com.example.jcandevformula.c10_scaffold

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FABExample() {

    FloatingActionButton(
        onClick = { },
        shape = RoundedCornerShape(16.dp),
        containerColor = Color.Blue,
        contentColor = Color.White,
        modifier = Modifier.size(66.dp)
    ) {
        Icon(
            Icons.Default.Add,
            "Add New Number"
        )
    }

}