package com.example.calculatorapp.domain.repositoryInterfaces

import com.example.calculatorapp.domain.entities.Calculation

interface MainScreenRepositoryInterface {
    suspend fun addCalculation(calculation: Calculation)
    suspend fun getCalculations(calculation: Calculation)
}