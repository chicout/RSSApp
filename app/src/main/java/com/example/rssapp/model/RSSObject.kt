package com.example.rssapp.model

import com.example.rssapp.model.Feed
import com.example.rssapp.model.Item

data class RSSObject(
    val status: String,
    val feed: Feed,
    val items: List<Item>
)

