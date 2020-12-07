package org.sheridancollege.expensetracker.db

import android.icu.util.CurrencyAmount
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date
import java.util.*

@Entity(tableName = "expenses")
data class ExpenseEntity(

        @PrimaryKey(autoGenerate = true)
    var id: Long,

        @ColumnInfo(name = "date")
    var date: String,

        @ColumnInfo(name = "description")
    var description: String,

        @ColumnInfo(name = "amount")
    var amount: Double
)