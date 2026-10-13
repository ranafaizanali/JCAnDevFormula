package com.example.jcandevformula.c17_navigationbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person2
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jcandevformula.c17_navigationbar.screens.NavBarHomeScreen
import com.example.jcandevformula.c17_navigationbar.screens.NavBarProfileScreen
import com.example.jcandevformula.c17_navigationbar.screens.NavBarSearchScreen

@Composable
fun BottomNavigationBar() {

    val navController = rememberNavController()

    var selectedItem by remember { mutableStateOf<NavBarRoutes>(NavBarRoutes.NavBarHome) }

    val navBarItems = listOf<NavBarItem>(
        NavBarItem(
            route = NavBarRoutes.NavBarHome,
            icon = Icons.Default.Home,
            label = "Home"
        ),
        NavBarItem(
            route = NavBarRoutes.NavBarSearch,
            icon = Icons.Default.Search,
            label = "Search"
        ),
        NavBarItem(
            route = NavBarRoutes.NavBarProfile,
            icon = Icons.Default.Person2,
            label = "Profile"
        )
    )

    Scaffold(
        bottomBar = {
            NavigationBar {

                navBarItems.forEach { item ->

                    NavigationBarItem(
                        selected = selectedItem == item.route,
                        onClick = {
                            selectedItem = item.route
                            navController.navigate(item.route)
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.label
                            )
                        },
                        label = { Text(text = item.label) },
                        alwaysShowLabel = false,
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.Blue,
                            selectedTextColor = Color.Blue,
                            indicatorColor = Color.Blue.copy(alpha = .1f),
                            unselectedIconColor = Color.Black
                        )
                    )

                }

            }
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = NavBarRoutes.NavBarHome,
            modifier = Modifier.padding(innerPadding)
        ) {

            composable<NavBarRoutes.NavBarHome> {
                NavBarHomeScreen()
            }

            composable<NavBarRoutes.NavBarSearch> {
                NavBarSearchScreen()
            }

            composable<NavBarRoutes.NavBarProfile> {
                NavBarProfileScreen()
            }

        }

    }

}

