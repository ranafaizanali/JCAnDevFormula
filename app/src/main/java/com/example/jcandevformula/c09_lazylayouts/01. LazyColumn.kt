package com.example.jcandevformula.c09_lazylayouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample() {

//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .verticalScroll(rememberScrollState()),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//
//        for (i in 1..20) {
//            Text(
//                text = "Number : $i",
//                modifier = Modifier
//                    .background(color = Color.Black, shape = CircleShape)
//                    .padding(16.dp),
//                color = Color.White
//            )
//        }
//
//    }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        items(30) { number ->
            Text(text = "Number : $number")
        }

    }

}