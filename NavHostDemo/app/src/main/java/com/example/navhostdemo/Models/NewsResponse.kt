package com.example.navhostdemo.Models

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)