package com.gcr.hilt01.model

data class UserResponse(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)