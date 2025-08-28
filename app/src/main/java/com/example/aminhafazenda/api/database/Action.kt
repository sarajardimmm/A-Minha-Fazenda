package com.example.aminhafazenda.api.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Action (
    @PrimaryKey(autoGenerate = true) val actionId: Int,
    @ColumnInfo(name = "action_name") val actionName: String?,
    @ColumnInfo(name = "date_time") val dateTime: Long?, // System.currentTimeMillis()
    @ColumnInfo(name = "location_description") val locationDescription: String?,
    @ColumnInfo(name = "notes") val notes: String?
)