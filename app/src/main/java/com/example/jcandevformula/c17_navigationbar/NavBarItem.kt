package com.example.jcandevformula.c17_navigationbar

import androidx.compose.ui.graphics.vector.ImageVector

data class NavBarItem(
    val route: NavBarRoutes,
    val icon: ImageVector,
    val label: String
)
