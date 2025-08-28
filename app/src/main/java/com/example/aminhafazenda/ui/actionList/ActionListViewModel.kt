package com.example.aminhafazenda.ui.actionList

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.aminhafazenda.api.database.Action
import com.example.aminhafazenda.api.database.ActionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ActionListViewModel @Inject constructor(private val repository: ActionRepository) : ViewModel() {


    val allItems: LiveData<List<Action>> = repository.allActions.asLiveData()

    fun insert(dbItem: Action) = viewModelScope.launch {
        withContext(Dispatchers.IO) {
            repository.insertAction(dbItem)
        }
    }

    fun delete(id: Int) = viewModelScope.launch {
        withContext(Dispatchers.IO) {
            repository.deleteAction(id)
        }
    }

}