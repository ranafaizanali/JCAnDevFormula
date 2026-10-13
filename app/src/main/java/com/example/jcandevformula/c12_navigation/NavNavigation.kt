package com.example.jcandevformula.c12_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.jcandevformula.c12_navigation.screens.NavHomeScreen
import com.example.jcandevformula.c12_navigation.screens.NavLoginScreen
import com.example.jcandevformula.c12_navigation.screens.NavProfileScreen

@Composable
fun NavNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.NavLogin
    ) {

        composable<NavRoutes.NavLogin> {
            NavLoginScreen(
                toHome = { navController.navigate(NavRoutes.NavHome) },
                toProfile = { name ->
                    navController.navigate(NavRoutes.NavProfile(name = name))
                }
            )
        }

        composable<NavRoutes.NavHome> {
            NavHomeScreen(toLogin = { navController.navigate(NavRoutes.NavLogin) })
        }

        composable<NavRoutes.NavProfile> { backStackEntry ->
            val getName = backStackEntry.toRoute<NavRoutes.NavProfile>()
            NavProfileScreen(
                toHome = { navController.navigate(NavRoutes.NavHome) },
                toLogin = { navController.navigate(NavRoutes.NavLogin) },
                name = getName.name
            )
        }

    }

}