package com.example.calculatorapp.data.repositories

import com.example.calculatorapp.data.databases.CalculationDao
import com.example.calculatorapp.domain.entities.Calculation
import com.example.calculatorapp.domain.repositoryInterfaces.MainScreenRepositoryInterface

class MainScreenRepository(private val dao: CalculationDao): MainScreenRepositoryInterface {
    override suspend fun addCalculation(calculation: Calculation) {
        dao.insert(calculation)
    }

    override suspend fun getCalculations(calculation: Calculation) {
        dao.getAllCalculations()
    }
}