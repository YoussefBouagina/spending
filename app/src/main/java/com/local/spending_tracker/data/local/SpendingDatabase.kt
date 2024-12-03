package com.local.spending_tracker.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [SpendingEntity::class],
    version = 1
)
abstract class SpendingDatabase: RoomDatabase() {
    abstract val dao: SpendingDao
}