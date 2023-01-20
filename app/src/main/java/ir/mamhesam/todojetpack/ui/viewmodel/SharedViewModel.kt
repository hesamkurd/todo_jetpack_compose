package ir.mamhesam.todojetpack.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.mamhesam.todojetpack.data.models.ToDoTask
import ir.mamhesam.todojetpack.data.repository.ToDoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(
    private val toDoRepository : ToDoRepository
): ViewModel()
{
    private val _allTask = MutableStateFlow<List<ToDoTask>>(emptyList())
    val allTask : StateFlow<List<ToDoTask>> = _allTask
    
    fun getAllTask(){
        viewModelScope.launch {
            toDoRepository.getAllTask.collect {
                _allTask.value = it
            }
        }
    }
}