package com.example.myapplication.ui.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val repo: MainRepository) : ViewModel() {
    val userItemsUiState=repo.getUsers()
}