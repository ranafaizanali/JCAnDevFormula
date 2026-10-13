package com.example.jcandevformula.c9_lazylayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ItemsExample() {

    Row (
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {

        // item (single)
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {
                Text(
                    text = "Heading",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Black
                )
            }

            items(30) { number ->
                Text(
                    text = "${number + 1}",
                    modifier = Modifier
                        .background(color = Color.Black, shape = CircleShape)
                        .padding(16.dp),
                    color = Color.White
                )
            }

        }

        // items (count)
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            items(30) { number ->
                Text(
                    text = "${number + 1}",
                    modifier = Modifier
                        .background(color = Color.Black, shape = CircleShape)
                        .padding(16.dp),
                    color = Color.White
                )
            }

        }

        // items (list/array)
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            val names = listOf<String>("Faizan", "Rahul", "Rohit", "Abhishek", "Faizan", "Rahul", "Rohit", "Abhishek", "Faizan", "Rahul", "Rohit", "Abhishek", "Faizan", "Rahul", "Rohit", "Abhishek")

            items(names){ name ->
                Text(
                    text = name,
                    modifier = Modifier
                        .background(color = Color.Black, shape = CircleShape)
                        .padding(16.dp),
                    color = Color.White
                )
            }

        }

        // itemsIndexed(list/array)
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            val names = listOf<String>("Faizan", "Rahul", "Rohit", "Abhishek", "Faizan", "Rahul", "Rohit", "Abhishek", "Faizan", "Rahul", "Rohit", "Abhishek", "Faizan", "Rahul", "Rohit", "Abhishek")

            itemsIndexed(names){ index, name ->

                Text(
                    text = "${index+1} $name",
                    modifier = Modifier
                        .background(color = Color.Black, shape = CircleShape)
                        .padding(16.dp),
                    color = Color.White
                )

            }

        }

    }

}