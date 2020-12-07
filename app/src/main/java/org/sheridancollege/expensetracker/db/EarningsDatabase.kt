package org.sheridancollege.expensetracker.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

@Database(entities = [EarningsEntity::class], version = 1)
abstract class EarningsDatabase : RoomDatabase() {
    abstract fun expenseDao():EarningsDao

    companion object {

        @Volatile
        private var INSTANCE: EarningsDatabase? = null

        fun getInstance(context: Context): EarningsDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context,
                    EarningsDatabase::class.java,
                    "earnings.db")
                    .build()
            }
            return INSTANCE as EarningsDatabase
        }
    }
}