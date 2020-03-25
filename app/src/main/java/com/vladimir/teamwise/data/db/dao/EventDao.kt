package com.vladimir.teamwise.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vladimir.teamwise.data.db.entity.Event

@Dao
interface EventDao {

    @Query("DELETE FROM event_table")
    suspend fun deleteAllEvent()

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addEvent(event: Event)

    @Query("DELETE FROM event_table WHERE title LIKE :eventTitle")
    fun deleteEvent(eventTitle: String)

    @Query("SELECT * FROM event_table")
    fun getAllEvent(): LiveData<List<Event>>

    @Query("SELECT * FROM event_table WHERE title LIKE :eventTitle")
    fun findEventByTitle(eventTitle: String): LiveData<List<Event>>
}