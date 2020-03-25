package com.vladimir.teamwise.data.repository

import androidx.lifecycle.LiveData
import com.vladimir.teamwise.data.db.dao.EventDao
import com.vladimir.teamwise.data.db.entity.Event

class EventRepository(private val eventDao: EventDao) {
    val allEvents: LiveData<List<Event>> = eventDao.getAllEvent()

    suspend fun insert(event: Event){
        eventDao.addEvent(event)
    }
}