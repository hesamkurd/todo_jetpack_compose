package ir.mamhesam.todojetpack.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import ir.mamhesam.todojetpack.utils.Action
import ir.mamhesam.todojetpack.utils.Constants

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
){
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(Constants.TASK_ARG_KEY){
            type = NavType.IntType
        })
    ){
    
    }
}