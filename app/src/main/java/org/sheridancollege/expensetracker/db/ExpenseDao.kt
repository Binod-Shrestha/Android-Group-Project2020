package org.sheridancollege.expensetracker.db;

import androidx.room.*;

import java.util.List;

@Dao
interface ExpenseDao{

    @Query("SELECT * FROM expenses")
    fun getAllExpenses(): List<ExpenseEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(student: ExpenseEntity)

    @Query("Delete FROM expenses")
    fun deleteALL()
}