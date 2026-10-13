package com.example.jcandevformula.c16_dropdownmenu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.PopupProperties

@Composable
fun ListDropDown() {

    var selectedCountry by remember { mutableStateOf("India") }
    var expanded by remember { mutableStateOf(false) }

    val countries = listOf<String>(
        "Argentina",
        "Bolivia",
        "Chile",
        "Colombia",
        "Ecuador",
        "Peru",
        "India",
        "Mexico",
        "Paraguay",
        "Uruguay",
        "Venezuela",
        "Brazil",
        "Canada",
        "USA",
        "Bangladesh",
        "Nepal",
        "Srilanka",
        "Pakistan",
        "Afghanistan",
        "Iran",
        "Iraq",
        "Saudi Arabia",
        "Kuwait",
        "UAE",
        "Oman",
        "Qatar",
        "Bahrain",
        "Egypt",
        "Palestine",
        "Jordan",
        "Syria"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Select Your Country: $selectedCountry",
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

                    Text(text = selectedCountry)

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
                properties = PopupProperties(
                    focusable = false,
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true
                ),
                containerColor = Color.White
            ) {

                countries.forEach { countryName ->

                    DropdownMenuItem(
                        text = { Text(text = countryName) },
                        onClick = {
                            selectedCountry = countryName
                            expanded = false
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

}