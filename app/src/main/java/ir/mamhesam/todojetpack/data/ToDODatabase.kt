package ir.mamhesam.todojetpack.data

import androidx.room.Database
import androidx.room.RoomDatabase
import ir.mamhesam.todojetpack.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDODatabase: RoomDatabase()
{
    abstract fun toDoDao(): ToDoDao
}