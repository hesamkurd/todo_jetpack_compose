package ir.mamhesam.todojetpack.navigation

import androidx.navigation.NavHostController
import ir.mamhesam.todojetpack.utils.Action
import ir.mamhesam.todojetpack.utils.Constants

class Screen(navController : NavHostController)
{
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}"){
            popUpTo(Constants.LIST_SCREEN){inclusive = true}
        }
    }
    
    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}