package ir.mamhesam.todojetpack.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import ir.mamhesam.todojetpack.navigation.destinations.listComposable
import ir.mamhesam.todojetpack.navigation.destinations.taskComposable
import ir.mamhesam.todojetpack.utils.Constants

@Composable
fun SetUpNavigation(
    navController : NavHostController
){
    val screen = remember(navController){
        Screen(navController = navController)
    }
    NavHost(
        navController = navController,
        startDestination = Constants.LIST_SCREEN
    ){
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}