package com.example.calculatorapp.domain.useCases

import com.example.calculatorapp.data.repositories.MainScreenRepository

class MainScreenUseCases {
    class AddNumbers(
        private val runningTotal: Int,
        private val input: Int
    ){
        fun add(): Int{
            return (runningTotal + input)
        }
    }

    class SubtractNumbers(
        private val runningTotal: Int,
        private val input: Int
    ){
        fun subtract(): Int{
            return (runningTotal - input)
        }
    }

    class MultiplyNumbers(
        private val runningTotal: Int,
        private val input: Int
    ){
        fun multiply(): Int{
            return (runningTotal * input)
        }
    }

    class DivideNumbers(
        private val runningTotal: Int,
        private val input: Int
    ){
        fun divide(): Int{
            return (runningTotal / input)
        }
    }
}