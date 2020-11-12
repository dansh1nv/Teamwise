package com.vladimir.teamwise.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "firstName")
    val firstName: String,
    @ColumnInfo(name = "lastName")
    val lastName: String,
    @ColumnInfo(name = "userName")
    val userName: String,
    @ColumnInfo(name = "city")
    val city: String,
    @ColumnInfo(name = "photo")
    val photo: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "countHost")
    val countHost: Int,
    @ColumnInfo(name = "countMember")
    val countMember: Int,
    @ColumnInfo(name = "countSubscription")
    val countSubscription: Int,
    @ColumnInfo(name = "countSubscribe")
    val countSubscribe: Int
)