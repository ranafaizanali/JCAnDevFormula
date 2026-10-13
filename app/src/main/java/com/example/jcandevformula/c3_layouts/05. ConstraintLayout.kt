package com.example.jcandevformula.c3_layouts

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ConstraintLayoutExample() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 24.dp, horizontal = 16.dp)
    ) {

        val (firstName, secondName, description) = createRefs()

        Text(
            text = "Faizan",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(firstName) {}
        )

        Text(
            text = "Ali",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.constrainAs(secondName) {
                start.linkTo(parent.start, margin = 16.dp)
                end.linkTo(parent.end)
            }
        )

        Text(
            text = "Full Stack App Developer at Neat Roots",
            modifier = Modifier.constrainAs(description) {
                top.linkTo(firstName.bottom, margin = 2.dp)
                start.linkTo(firstName.start)
            }
        )

    }

}