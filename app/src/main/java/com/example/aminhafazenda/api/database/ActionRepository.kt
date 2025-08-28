package com.example.aminhafazenda.api.database

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ActionRepository @Inject constructor(private val actionLocalSource: ActionLocalSource) {

    val allActions: Flow<List<Action>> = actionLocalSource.getAllActions()

    fun insertAction(action: Action) {
        actionLocalSource.insertAction(action)
    }

    fun deleteAction(id: Int) {
        actionLocalSource.deleteAction(id)
    }

}