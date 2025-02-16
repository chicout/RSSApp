package com.example.rssapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rssapp.data.NewsDao
import com.example.rssapp.data.RssEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dao: NewsDao
): ViewModel() {

    fun insert(rssEntity: RssEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.insertRssEntity(rssEntity)
        }
    }

    fun getRss(): LiveData<RssEntity?> {
        return dao.getLatestRss()
    }
}