package com.example.calculatorapp.presentation.ui

data class CalculatorState(
    val currentInput : String,
    val runningTotal : Int,
    val nextOperation: Char
)