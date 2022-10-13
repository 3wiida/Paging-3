package com.example.myapplication.ui.main

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.myapplication.network.api.Api
import com.example.myapplication.network.model.user.Result
import java.lang.Exception

class PagingSource (private val UserService:Api) :PagingSource<Int,Result>(){
    val FIRST_PAGE_INDEX: Int =1

    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1) ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        val page=params.key ?:FIRST_PAGE_INDEX
        return try {
            val response=UserService.fetchUsers(page,params.loadSize)
            val prevPage= if(page == FIRST_PAGE_INDEX) null else page.minus(1)
            val nextPage= if(response.isEmpty()) null else page.plus(1)
            LoadResult.Page(data = response, prevKey = prevPage, nextKey = nextPage)
        }catch (e:Exception){
            LoadResult.Error(e)
        }
    }

}