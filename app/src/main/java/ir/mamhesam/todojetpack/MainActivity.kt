package ir.mamhesam.todojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import ir.mamhesam.todojetpack.navigation.SetUpNavigation
import ir.mamhesam.todojetpack.ui.theme.ToDoJetpackTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity()
{
    private lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoJetpackTheme {
                navController = rememberNavController()
                SetUpNavigation(navController = navController)
            }
        }
    }
}

