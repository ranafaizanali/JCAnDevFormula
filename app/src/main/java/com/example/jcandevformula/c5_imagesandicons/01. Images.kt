package com.example.jcandevformula.c5_imagesandicons

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcandevformula.R


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ImageExample() {

    Image(
        painter = painterResource(id = R.drawable.android_icon),
        contentDescription = "Android Icon",
        modifier = Modifier.size(200.dp),
        contentScale = ContentScale.Fit,
        alignment = Alignment.TopCenter
    )

}