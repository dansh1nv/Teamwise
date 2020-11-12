package com.vladimir.teamwise.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event_table")
data class Event(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "city")
    val city: String,
    @ColumnInfo(name = "date")
    val date: String,
    @ColumnInfo(name = "eventPicture")
    val eventPicture: String,
    @ColumnInfo(name = "tag")
    val tag: String, //Возможность иметь много тегов
    @ColumnInfo(name = "host")
    val host: String //Организатор
)