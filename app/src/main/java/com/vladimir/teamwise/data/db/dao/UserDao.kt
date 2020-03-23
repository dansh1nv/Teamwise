package com.vladimir.teamwise.data.db.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vladimir.teamwise.data.db.entity.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveUser(user: User)

    @Query("DELETE FROM user_table")
    fun deleteUser()

    @Query("SELECT * FROM user_table")
    fun getUser():LiveData<User>
}