package com.example.calculatorapp.data.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.calculatorapp.domain.entities.Calculation

@Database(entities = [Calculation::class], version = 1)
abstract class CalculationsDatabase : RoomDatabase() {
    abstract fun calculationDao(): CalculationDao
}