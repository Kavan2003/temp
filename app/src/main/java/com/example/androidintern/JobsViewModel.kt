package com.example.androidintern

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class JobsViewModel(private val repository: JobRepository) : ViewModel() {
    val jobs = repository.getJobs(1)
    fun bookmarkJob(job: Job) = viewModelScope.launch { repository.bookmarkJob(job) }
}
