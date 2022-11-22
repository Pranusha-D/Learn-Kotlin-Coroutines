package me.amitshekhar.learn.kotlin.coroutines.data.local

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import me.amitshekhar.learn.kotlin.coroutines.data.local.entity.User

class DatabaseHelperImpl(private val appDatabase: AppDatabase) : DatabaseHelper {

    override suspend fun getUsers(): List<User> = appDatabase.userDao().getAll()

    override suspend fun insertAll(users: List<User>) = appDatabase.userDao().insertAll(users)

}