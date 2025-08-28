package com.example.aminhafazenda.api.database

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ActionLocalSource @Inject constructor(private val actionDao: ActionHistoryDao) {

    fun getAllActions(): Flow<List<Action>> {
        return actionDao.getAll()
    }
    fun insertAction(action: Action) {
        actionDao.insertAll(action)
    }

    fun deleteAction(id: Int) {
        actionDao.delete(id)
    }

}