package com.example.rssapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.rssapp.data.RssEntity

@Dao
interface NewsDao {

    @Insert
    fun insertRssEntity(rssEntity: RssEntity)

    @Query("SELECT * FROM rss_table ORDER BY id DESC LIMIT 1")
    fun getLatestRss(): LiveData<RssEntity?>
}