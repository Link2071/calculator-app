package com.example.calculatorapp.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "calculations")
data class Calculation(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val calculationInput: String
)