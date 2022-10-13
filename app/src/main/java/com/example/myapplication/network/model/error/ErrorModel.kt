package com.example.myapplication.network.model.error

data class ErrorModel(
    val status: String?=null,
    val message: String?=null,
    val error: Map<String, List<String>>?=null
)