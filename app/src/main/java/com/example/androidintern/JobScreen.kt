package com.example.androidintern

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun JobsScreen(jobsViewModel: JobsViewModel) {
    val jobs by jobsViewModel.jobs.observeAsState(initial = emptyList())
    // Display jobs in a list
    // On job click, navigate to JobDetailsScreen
}

