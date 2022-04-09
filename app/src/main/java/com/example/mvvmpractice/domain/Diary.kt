package com.example.mvvmpractice.domain

import java.util.*

data class Diary(
    val id: String,
    val title: String,
    val content: String,
    val createDate: Date,
)
