package com.example.aminhafazenda.api.database

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import jakarta.inject.Singleton
import com.example.aminhafazenda.api.database.AppDatabase
import com.example.aminhafazenda.api.database.ActionHistoryDao

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "your_database_name"
        ).build()
    }

    @Provides
    fun provideActionHistoryDao(database: AppDatabase): ActionHistoryDao {
        return database.actionHistoryDao()
    }
}