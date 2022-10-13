package com.example.myapplication.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.network.model.user.Result
import javax.inject.Inject

class UserAdapter @Inject constructor():PagingDataAdapter<Result,UserAdapter.MyViewHolder>(DiffUtils()) {
     inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

     }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO()
    }

    class DiffUtils:DiffUtil.ItemCallback<Result>(){
        override fun areItemsTheSame(oldItem: Result, newItem: Result) = oldItem.email==newItem.email

        override fun areContentsTheSame(oldItem: Result, newItem: Result) = oldItem ==newItem

    }
}