package com.example.jcandevformula.c17_navigationbar

import kotlinx.serialization.Serializable

@Serializable
sealed class NavBarRoutes {

    @Serializable
    object NavBarHome : NavBarRoutes()

    @Serializable
    object NavBarSearch : NavBarRoutes()

    @Serializable
    object NavBarProfile : NavBarRoutes()
}