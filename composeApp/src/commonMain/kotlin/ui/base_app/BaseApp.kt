package ui.base_app

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
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
import bottombarexperimen.composeapp.generated.resources.Res
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabDisposable
import cafe.adriel.voyager.navigator.tab.TabNavigator
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import ui.component.BottomNavigationItem
import ui.home.HomeTab
import ui.prodiuctList.ProductListTab
import ui.product_details.ProductDetails
import ui.profile.ProfileTab

class BaseApp(val tabIndex: Int) : Screen {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {

        val items = listOf(
            BottomNavigationItem(
                title = "Home",
                selectedIcon = Icons.Filled.Home,
                unselectedIcon = Icons.Outlined.Home,
                hasNews = false,
            ),
            BottomNavigationItem(
                title = "Chat",
                selectedIcon = Icons.Filled.Email,
                unselectedIcon = Icons.Outlined.Email,
                hasNews = false,
                badgeCount = 45
            ),
            BottomNavigationItem(
                title = "Settings",
                selectedIcon = Icons.Filled.Settings,
                unselectedIcon = Icons.Outlined.Settings,
                hasNews = true,
            )
        )

        var selectedItemIndex by remember { mutableStateOf(tabIndex) }

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
                        items.forEachIndexed { index, item ->
                            NavigationBarItem(
                                selected = selectedItemIndex == index,
                                onClick = {
                                    selectedItemIndex = index
                                    tabNavigator.current = when (index) {
                                        0 -> HomeTab
                                        1 -> ProductListTab
                                        else -> ProfileTab
                                    }
                                },
                                icon = {
                                    Icon(
                                        imageVector = if (index == selectedItemIndex) {
                                            item.selectedIcon
                                        } else item.unselectedIcon,
                                        contentDescription = item.title
                                    )
                                }
                            )

                        }


//                        NavigationBarItem(
//                            selected = tabNavigator.current.key == HomeTab.key,
//                            onClick = { tabNavigator.current = HomeTab },
//                            icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
//                            label = { Text("Home") }
//                        )
//                        NavigationBarItem(
//                            selected = tabNavigator.current.key == ProductListTab.key,
//                            onClick = { tabNavigator.current = ProductListTab },
//                            icon = {
//                                Icon(
//                                    Icons.Filled.ShoppingCart,
//                                    contentDescription = "ProductList"
//                                )
//                            },
//                            label = { Text("ProductList") }
//                        )
//                        NavigationBarItem(
//                            selected = tabNavigator.current.key == ProfileTab.key,
//                            onClick = { tabNavigator.current = ProfileTab },
//                            icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
//                            label = { Text("Profile") }
//                        )
                    }
                }
            )
        }
    }
}