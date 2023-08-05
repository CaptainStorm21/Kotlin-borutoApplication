package com.kotlinprojects.borutoapplication.navigation

import com.kotlinprojects.borutoapplication.navigation.Screen.Splash.route

sealed class Screen(
    var route: String
){
    object Splash: Screen(route= "splash_screen")
    object Welcome: Screen(route = "welcome_screen")
    object Home: Screen(route = "home_screen")
    object Details: Screen(route = "details_screen"){
        fun passHeroId(heroId: Int): String{
            return 'details_screen'
        }
    }
    object Search : Screen (route = "search_screen")
}
