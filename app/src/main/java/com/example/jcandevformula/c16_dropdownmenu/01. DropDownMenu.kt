package com.example.jcandevformula.c16_dropdownmenu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.material.icons.filled.Transgender
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.PopupProperties

@Composable
fun DropDownMenuExample() {

    var selectedGender by remember { mutableStateOf("Male") }
    var expanded by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Select Your Gender: $selectedGender",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Box {

            Button(onClick = { expanded = true }) {

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(text = selectedGender)

                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Select Your Gender"
                    )
                }

            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                offset = DpOffset(100.dp, 0.dp),
                scrollState = scrollState,
                properties = PopupProperties(
                    focusable = false,
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true
                ),
                containerColor = Color.White
            ) {

                DropdownMenuItem(
                    text = { Text(text = "Male") },
                    onClick = {
                        selectedGender = "Male"
                        expanded = false
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Male,
                            contentDescription = "Male"
                        )
                    },
                    colors = MenuDefaults.itemColors(
                        textColor = Color.Black,
                        leadingIconColor = Color.Black
                    )
                )

                HorizontalDivider()

                DropdownMenuItem(
                    text = { Text(text = "Female") },
                    onClick = {
                        selectedGender = "Female"
                        expanded = false
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Female,
                            contentDescription = "Female"
                        )
                    },
                    colors = MenuDefaults.itemColors(
                        textColor = Color.Black,
                        leadingIconColor = Color.Black
                    )
                )

                HorizontalDivider()

                DropdownMenuItem(
                    text = { Text(text = "Transgender") },
                    onClick = {
                        selectedGender = "Transgender"
                        expanded = false
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Transgender,
                            contentDescription = "Transgender"
                        )
                    },
                    colors = MenuDefaults.itemColors(
                        textColor = Color.Black,
                        leadingIconColor = Color.Black
                    )
                )

            }

        }

    }

}