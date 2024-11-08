package utils

import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.Navigator

fun pushToScreen(navController: Navigator, screen: Screen) {
//    Logger.d { "^^^ navController level is ${navController.level} " }
    var navigatorAtLevel: Navigator? = navController
    repeat(navController.level) {
        navigatorAtLevel = navigatorAtLevel?.parent
    }
    navigatorAtLevel?.push(screen)
}

fun replaceAllToScreen(navController: Navigator, screen: Screen) {
//    Logger.d { "^^^ navController level is ${navController.level} " }
    var navigatorAtLevel: Navigator? = navController
    repeat(navController.level) {
        navigatorAtLevel = navigatorAtLevel?.parent
    }
    navigatorAtLevel?.replaceAll(screen)
}