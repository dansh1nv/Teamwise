package com.vladimir.teamwise.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vladimir.teamwise.data.db.dao.EventDao
import com.vladimir.teamwise.data.db.dao.UserDao
import com.vladimir.teamwise.data.db.entity.Event
import com.vladimir.teamwise.data.db.entity.User
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized

@Database(entities = [Event::class, User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract val userDao: UserDao
    abstract val eventDao: EventDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        @InternalCoroutinesApi
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
                context,
                AppDatabase::class.java, "teamwise.db"
            )
            .build()
    }
}