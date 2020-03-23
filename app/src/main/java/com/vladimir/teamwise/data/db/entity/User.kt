package com.vladimir.teamwise.data.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "firstName")
    var firstName: String,
    @ColumnInfo(name = "lastName")
    var lastName: String,
    @ColumnInfo(name = "userName")
    var userName: String,
    @ColumnInfo(name = "city")
    var city: String,
    @ColumnInfo(name = "photo")
    var photo: String,
    @ColumnInfo(name = "description")
    var description: String,
    @ColumnInfo(name = "countHost")
    var countHost: Int,
    @ColumnInfo(name = "countMember")
    var countMember: Int,
    @ColumnInfo(name = "countSubscription")
    var countSubscription: Int,
    @ColumnInfo(name = "countSubscribe")
    var countSubscribe: Int
)