package com.example.calculatorapp.data.databases

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.calculatorapp.domain.entities.Calculation

@Dao
interface CalculationDao {
    @Insert
    suspend fun insert(calculation: Calculation)

    @Query(value = "SELECT * FROM calculations")
    suspend fun getAllCalculations(): List<Calculation>
}