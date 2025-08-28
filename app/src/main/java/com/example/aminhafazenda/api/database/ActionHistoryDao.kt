package com.example.aminhafazenda.api.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface  ActionHistoryDao {
    @Query("SELECT * FROM `action`")
    fun getAll(): List<Action>

    @Query("SELECT * FROM `action` WHERE actionId IN (:actionIds)")
    fun loadAllByIds(actionIds: IntArray): List<Action>

    @Query("SELECT * FROM `action` WHERE action_name LIKE :actionName ")
    fun findByName(actionName: String): List<Action>

    @Insert
    fun insertAll(vararg action: Action)

    @Delete
    fun delete(user: Action)
}