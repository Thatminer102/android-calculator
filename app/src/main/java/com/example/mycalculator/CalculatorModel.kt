package com.example.mycalculator

import com.ezylang.evalex.Expression
import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class CalculatorModel {
    var expString:String = ""

    fun performCalculation(): String {
        if (expString.isEmpty()) {
            return ""
        }

        return try {
            val formatStr = Expression(expString.replace("×", "*").replace("÷", "/"))
            val result = formatStr.evaluate()
            val numberValue = result.numberValue

            if (numberValue.abs() >= BigDecimal(1000000) || numberValue.abs() >= BigDecimal(0.0000001)) {
                numberValue.round(MathContext(7, RoundingMode.HALF_UP)).toString()
            } else {
                numberValue.round(MathContext(8, RoundingMode.HALF_UP)).toPlainString()
            }
        } catch (e: Exception) {
            println(e.message)
            if (e.message == "Division by zero")
                "Undefined"
            else
                "Error"
        }
    }
}