package com.example.rssapp.`interface`

import android.view.View


interface ItemClickListener {
    fun onClick(view: View?, position: Int, isLongClick: Boolean)
}