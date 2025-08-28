package com.example.aminhafazenda.api.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface  ActionHistoryDao {
    @Query("SELECT * FROM `action`")
    fun getAll(): Flow<List<Action>>

    @Query("SELECT * FROM `action` WHERE actionId IN (:actionIds)")
    fun loadAllByIds(actionIds: IntArray): List<Action>

    @Query("SELECT * FROM `action` WHERE action_name LIKE :actionName ")
    fun findByName(actionName: String): List<Action>

    @Insert
    fun insertAll(vararg action: Action)

    @Query("DELETE FROM `action` WHERE actionId = :id")
    fun delete(id: Int)
}