package ir.mamhesam.todojetpack.data.repository

import dagger.hilt.android.scopes.ViewModelScoped
import ir.mamhesam.todojetpack.data.ToDoDao
import ir.mamhesam.todojetpack.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao : ToDoDao)
{
    val getAllTask: Flow<List<ToDoTask>> = toDoDao.getAllTask()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()
    
    fun getSelectedTask(taskId: Int): Flow<ToDoTask> {
        return toDoDao.getSelectedTask(taskId = taskId)
    }
    
    suspend fun addTask(toDoTask : ToDoTask) {
        toDoDao.addTask(toDoTask = toDoTask)
    }
    
    suspend fun removeTask(toDoTask : ToDoTask) {
        toDoDao.addTask(toDoTask = toDoTask)
    }
    
    suspend fun updateTask(toDoTask : ToDoTask) {
        toDoDao.addTask(toDoTask = toDoTask)
    }
    
    suspend fun deleteAll() {
        toDoDao.deleteAllTask()
    }
    
    fun searchQuery(searchQuery: String): Flow<List<ToDoTask>>{
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }
    
}