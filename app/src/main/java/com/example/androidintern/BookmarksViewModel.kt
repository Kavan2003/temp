package com.example.androidintern

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class BookmarksViewModel(private val repository: JobRepository) : ViewModel() {
    val bookmarkedJobs = repository.getBookmarkedJobs()
}
