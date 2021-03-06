package com.example.daadalotaibi_beltexam.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
@Dao
interface  TVDao {
    @Query("Select * from TV")
    fun getShows() : LiveData<List<TV>>

    @Insert
    fun addShow(tvShow:TV)

    @Delete
    fun deleteShow(tvShow:TV)
}