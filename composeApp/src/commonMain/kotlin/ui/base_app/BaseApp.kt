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
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import ui.home.HomeTab
import ui.prodiuctList.ProductListTab
import ui.product_details.ProductDetails
import ui.profile.ProfileTab

class BaseApp(val tabIndex: Int) : Screen {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        TabNavigator(
            HomeTab,
            tabDisposable = {
                TabDisposable(
                    navigator = it,
                    tabs = listOf(HomeTab, ProductListTab, ProfileTab)
                )
            },

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