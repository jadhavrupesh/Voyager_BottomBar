package ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.currentOrThrow
import ui.base_app.BaseApp
import ui.create_info.CreateInformation
import ui.information.Information
import ui.prodiuctList.ProductListView
import utils.replaceAllToScreen

class HomeView(private val baseNavController: Navigator) : Screen {

    @Composable
    override fun Content() {
        val navController = LocalNavigator.currentOrThrow
        Scaffold(
            modifier = Modifier.fillMaxSize().padding(bottom = 80.dp),
            content = {
                Box(
                    modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                    ) {
                        Text("HomeView", fontSize = 30.sp)
                        Button(onClick = {
                            navController.push(Information())
                        }) {
                            Text("Go to Information")
                        }

                        Button(onClick = {
                            baseNavController.parent?.push(CreateInformation())
                        }) {
                            Text("Go to Create Info")
                        }

                        Button(onClick = {
                            replaceAllToScreen(navController, BaseApp(1))
                        }) {
                            Text("Go to ProductList")
                        }
                    }
                }
            },
            floatingActionButton = {
                FloatingActionButton(
                    modifier = Modifier,
                    onClick = { /*TODO */ }) {
                    Icon(
                        imageVector = Icons.Filled.Add, contentDescription = "Add"
                    )
                }
            }
        )
    }
}