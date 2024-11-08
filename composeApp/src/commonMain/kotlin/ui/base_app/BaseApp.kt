package ui.base_app

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.core.screen.ScreenKey
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import ui.home.HomeTab
import ui.prodiuctList.ProductListTab
import ui.product_details.ProductDetails
import ui.profile.ProfileTab
import kotlin.random.Random

class BaseApp(val tabIndex: Int) : Screen {


    override val key: ScreenKey =
        super.key + "${Random.nextDouble(Double.MIN_VALUE, Double.MAX_VALUE)}"

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val initialTab = when (tabIndex) {
            0 -> HomeTab
            1 -> ProductListTab
            else -> ProfileTab
        }
        TabNavigator(
            initialTab,
            tabDisposable = {
                TabDisposable(
                    navigator = it,
                    tabs = listOf(HomeTab, ProductListTab, ProfileTab)
                )
            }, disposeNestedNavigators = false
        ) { tabNavigator ->
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = tabNavigator.current.options.title) })
                }, content = {
                    CurrentTab()
                }, bottomBar = {
                    NavigationBar() {
                        NavigationBarItem(
                            selected = tabNavigator.current.key == HomeTab.key,
                            onClick = { tabNavigator.current = HomeTab },
                            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                            label = { Text("Home") }
                        )
                        NavigationBarItem(
                            selected = tabNavigator.current.key == ProductListTab.key,
                            onClick = { tabNavigator.current = ProductListTab },
                            icon = {
                                Icon(
                                    Icons.Filled.ShoppingCart,
                                    contentDescription = "ProductList"
                                )
                            },
                            label = { Text("ProductList") }
                        )
                        NavigationBarItem(
                            selected = tabNavigator.current.key == ProfileTab.key,
                            onClick = { tabNavigator.current = ProfileTab },
                            icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
                            label = { Text("Profile") }
                        )
                    }
                }
            )
        }
    }
}