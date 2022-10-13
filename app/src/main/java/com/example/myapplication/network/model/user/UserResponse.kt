package com.example.myapplication.network.model.user

data class UserResponse(
    val info: Info,
    val results: List<Result>
)

data class Info(
    val page: Int,
    val results: Int,
    val seed: String,
    val version: String
)

data class Result(
    val cell: String,
    val email: String,
    val gender: String,
    val name: Name,
    val nat: String,
    val phone: String,
    val picture: Picture
)

data class Name(
    val first: String,
    val last: String,
    val title: String
)

data class Picture(
    val large: String,
    val medium: String,
    val thumbnail: String
)