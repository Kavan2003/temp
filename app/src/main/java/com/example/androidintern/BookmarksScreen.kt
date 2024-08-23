package com.example.androidintern

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState

@Composable
fun BookmarksScreen(bookmarksViewModel: BookmarksViewModel) {
    val bookmarkedJobs by bookmarksViewModel.bookmarkedJobs.observeAsState(initial = emptyList())
    // Display bookmarked jobs in a list
}
