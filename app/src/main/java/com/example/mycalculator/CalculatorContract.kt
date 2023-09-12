package com.example.mycalculator

interface CalculatorContract {
    interface View{
        fun setInputTextView(inputStr: String)
        fun setOutputTextView(outputStr: String)

        fun getInputTextView(): String
        fun getOutputTextView(): String
        fun getInputStr(): String

        fun appendInputStr(input: String)
        fun clearInputStr()
        fun deleteLastCharOfInputStr()

        fun clearInput()
        fun setPlusMinus()
    }

    interface Presenter{
        fun setView(view:View)
        fun start()
        fun doCalculation(cmd:String)
    }
}