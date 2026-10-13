package com.example.jcandevformula.c10_scaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ScaffoldExample() {

    Scaffold(
        topBar = { TopAppBarExample() },
        bottomBar = { BottomBarExample() },
        floatingActionButton = { FABExample() }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            items(30) { number ->
                Text(
                    text = "Number : ${number + 1}",
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.Black, shape = CircleShape)
                        .padding(16.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

        }

    }

}