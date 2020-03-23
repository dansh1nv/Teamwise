package com.vladimir.teamwise.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "event_table")
data class Event(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "description")
    var description: String,
    @ColumnInfo(name = "city")
    var city: String,
    @ColumnInfo(name = "date")
    var date: String,
    @ColumnInfo(name = "eventPicture")
    var eventPicture: String,
    @ColumnInfo(name = "tag")
    var tag: String, //Возможность иметь много тегов
    @ColumnInfo(name = "host")
    var host: String //Организатор
)