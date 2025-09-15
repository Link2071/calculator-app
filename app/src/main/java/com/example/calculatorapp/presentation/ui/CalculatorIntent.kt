package com.example.calculatorapp.presentation.ui

sealed class CalculatorIntent {
    class Add(): CalculatorIntent()
    class Subtract(): CalculatorIntent()
    class Multiply(): CalculatorIntent()
    class Divide(): CalculatorIntent()
}