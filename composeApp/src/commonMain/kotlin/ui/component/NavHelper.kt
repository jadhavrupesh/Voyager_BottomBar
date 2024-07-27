package ui.component

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import cafe.adriel.voyager.transitions.SlideTransition

class NavHelper(val screen: Screen) : Screen {
    @Composable
    override fun Content() {
        Navigator(screen = screen){ navigator ->
            SlideTransition(navigator = navigator)
        }

    }
}