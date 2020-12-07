package org.sheridancollege.expensetracker.db;

import androidx.room.*;

import java.util.List;

@Dao
interface EarningsDao{

    @Query("SELECT * FROM earnings")
    fun getAllExpenses(): List<ExpenseEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(student: EarningsEntity)

    @Query("Delete FROM earnings")
    fun deleteALL()
}