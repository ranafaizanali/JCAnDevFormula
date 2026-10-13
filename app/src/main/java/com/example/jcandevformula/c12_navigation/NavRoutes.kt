package com.example.jcandevformula.c12_navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes {

    @Serializable
    object NavLogin : NavRoutes()

    @Serializable
    object NavHome : NavRoutes()

    @Serializable
    data class NavProfile(val name: String) : NavRoutes()

}