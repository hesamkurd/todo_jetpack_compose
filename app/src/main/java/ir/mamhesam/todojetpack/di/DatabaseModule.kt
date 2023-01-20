package ir.mamhesam.todojetpack.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ir.mamhesam.todojetpack.data.ToDODatabase
import ir.mamhesam.todojetpack.utils.Constants.DATABASE_NAME
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule
{
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context : Context
    ) = Room.databaseBuilder(
        context,
        ToDODatabase::class.java,
        DATABASE_NAME
    ).build()
    
    @Singleton
    @Provides
    fun provideDao(toDODatabase : ToDODatabase) = toDODatabase.toDoDao()
}