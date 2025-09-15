package com.example.calculatorapp.presentation.widgets

import android.view.ViewDebug
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class CalculatorButtons {
    @Composable
    fun CalcButton(text: String){
        Button(
            modifier = Modifier
                .padding(16.dp)
                .size(64.dp),
            shape = CircleShape,
            onClick = { TODO() }
        ) {
            Text(
                text = text
            )
        }
    }

    @Composable
    fun calcRow(text1: String, text2: String, text3: String){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CalcButton(text1)
            CalcButton(text2)
            CalcButton(text3)
        }
    }

    @Preview
    @Composable
    fun buttonPreview(){
        Column {
            calcRow(text1 = "7", text2 = "8", text3 = "9")
            calcRow(text1 = "4", text2 = "5", text3 = "6")
            calcRow(text1 = "1", text2 = "2", text3 = "3")
        }
    }
}