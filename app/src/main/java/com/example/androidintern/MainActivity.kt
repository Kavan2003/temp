package com.example.androidintern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.twotone.MailOutline
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidintern.ui.theme.AndroidInternTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val jobRepository = JobRepository()
        val jobsViewModel = JobsViewModel(jobRepository)
        val bookmarksViewModel = BookmarksViewModel(jobRepository)

        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            AndroidInternTheme {
                Scaffold(
                    bottomBar = {
                        BottomAppBar(actions = {
                            IconButton(onClick = { navController.navigate("jobs") }) {
                                Icon(
                                    Icons.Filled.Home,
                                    contentDescription = "Jobs",
                                )
                            }
                            IconButton(onClick = { navController.navigate("bookmarks") }) {
                                Icon(
                                    Icons.TwoTone.MailOutline,
                                    contentDescription = "bookmarks",
                                )
                            }


                        })
                    }
                ) { innerPadding ->
                    NavHost(navController, startDestination = "jobs", Modifier.padding(innerPadding)) {
                        composable("jobs") { JobsScreen(jobsViewModel) }
                        composable("bookmarks") { BookmarksScreen(bookmarksViewModel) }
                    }
                }
            }
        }
    }
}

