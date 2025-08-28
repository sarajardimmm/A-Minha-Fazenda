package com.example.aminhafazenda

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import com.example.aminhafazenda.api.database.AppDatabase
import androidx.room.Room


@HiltAndroidApp
class MyApp: Application() {

    val database by lazy { Room.databaseBuilder(
        applicationContext,
        AppDatabase::class.java, "database-name"
    ).build() }
}