package com.example.androidintern

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

interface JobsApi {
    // Define your API calls here
}

interface JobsDao {
    // Define your database operations here
}

class JobRepository {

    private val jobsApi: JobsApi
   // private val jobsDao: JobsDao

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://testapi.getlokalapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        jobsApi = retrofit.create(JobsApi::class.java)
//        jobsDao = // initialize your database DAO here
    }

    suspend fun getJobs(page: Int): LiveData<List<Job>> {
        val response = withContext(Dispatchers.IO) { jobsApi.getJobs(page) }
        return MutableLiveData(response.results)
    }

    suspend fun bookmarkJob(job: Job) {
        withContext(Dispatchers.IO) { jobsDao.insert(job) }
    }

    fun getBookmarkedJobs(): LiveData<List<Job>> {
        return jobsDao.getAll()
    }
}