package com.example.myapplication.ui.main

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.myapplication.network.api.Api
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(val api:Api) {
    fun getUsers() = Pager(
        config = PagingConfig(pageSize = 20),
        pagingSourceFactory = {PagingSource(api)}
    ).flow
}