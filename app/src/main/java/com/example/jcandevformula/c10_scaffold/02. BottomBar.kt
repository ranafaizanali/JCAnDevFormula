package com.example.jcandevformula.c10_scaffold

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person2
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun BottomBarExample() {

    BottomAppBar(
        containerColor = Color.Blue.copy(alpha = .05f)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            IconButton(
                onClick = {},
                modifier = Modifier.size(48.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color.Blue,
                    containerColor = Color.Blue.copy(alpha = 0.1f)
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(28.dp)
                )
            }

            IconButton(
                onClick = {},
                modifier = Modifier.size(48.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color.Blue,
                    containerColor = Color.Blue.copy(alpha = 0.1f)
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search",
                    modifier = Modifier.size(28.dp)
                )
            }

            IconButton(
                onClick = {},
                modifier = Modifier.size(48.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color.Blue,
                    containerColor = Color.Blue.copy(alpha = 0.1f)
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Person2,
                    contentDescription = "Profile",
                    modifier = Modifier.size(28.dp)
                )
            }

        }
    }

}