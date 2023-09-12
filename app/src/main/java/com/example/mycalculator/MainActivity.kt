package com.example.mycalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),CalculatorContract.View {

    private lateinit var inputTextView: TextView
    private lateinit var outputTextView: TextView

    private val inputStr = StringBuilder()
    private lateinit var mPresenter: CalculatorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter = CalculatorPresenter()
        mPresenter.setView(this)
        mPresenter.start()

        inputTextView = findViewById(R.id.input)
        outputTextView = findViewById(R.id.output)

        setButtonClickListeners()

        if (savedInstanceState != null) {
            clearInput()
            inputStr.append(savedInstanceState.getString("inputStr", ""))
            setInputTextView(getInputStr())

            val savedOutput = savedInstanceState.getString("outputText", "")
            setOutputTextView(savedOutput)
        }
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("inputStr", inputTextView.text.toString())
        outState.putString("outputText", outputTextView.text.toString())
    }

    private fun setButtonClickListeners() {
        val buttonIds = arrayOf(
            R.id.button_0, R.id.button_1, R.id.button_2, R.id.button_3,
            R.id.button_4, R.id.button_5, R.id.button_6, R.id.button_7,
            R.id.button_8, R.id.button_9, R.id.button_addition,
            R.id.button_subtraction, R.id.button_multiply, R.id.button_division,
            R.id.button_dot
        )

        for (buttonId in buttonIds) {
            val button = findViewById<Button>(buttonId)
            button.setOnClickListener {
                onButtonClicked(button.text.toString())
            }
        }

        val backspaceButton = findViewById<Button>(R.id.button_backspace)
        backspaceButton.setOnClickListener {
            onBackspaceClicked()
        }

        val clearButton = findViewById<Button>(R.id.button_clear)
        clearButton.setOnClickListener {
            clearInput()
        }

        val plusMinusButton = findViewById<Button>(R.id.button_plus_minus)
        plusMinusButton.setOnClickListener {
            setPlusMinus()
        }

        val equalsButton = findViewById<Button>(R.id.button_equals)
        equalsButton.setOnClickListener {
            mPresenter.doCalculation(getInputStr())
        }
    }

    private fun onButtonClicked(buttonText: String) {
        appendInputStr(buttonText)
        setInputTextView(getInputStr())
    }

    private fun onBackspaceClicked() {
        if (getInputStr().isNotEmpty()) {
            deleteLastCharOfInputStr()
            setInputTextView(getInputStr())
        }
    }

    override fun setInputTextView(inputStr: String) {
        inputTextView.text = inputStr
    }

    override fun setOutputTextView(outputStr: String) {
        outputTextView.text = outputStr
    }

    override fun getInputTextView(): String {
        return inputTextView.text.toString()
    }

    override fun getOutputTextView(): String {
        return outputTextView.text.toString()
    }

    override fun getInputStr(): String {
        return inputStr.toString()
    }

    override fun appendInputStr(input: String) {
        inputStr.append(input)
    }

    override fun clearInputStr() {
        inputStr.clear()
    }

    override fun deleteLastCharOfInputStr() {
        inputStr.deleteCharAt(inputStr.length - 1)
    }

    override fun clearInput() {
        clearInputStr()
        inputTextView.text = ""
        outputTextView.text = ""
    }

    override fun setPlusMinus() {
        val currentInput = getInputStr()

        if (currentInput.isNotEmpty()) {
            // Find the boundaries of the most recent number
            var startIdx = currentInput.length - 1
            var endIdx = currentInput.length - 1

            // Scan from right to left to find the boundaries
            while (startIdx >= 0 && (currentInput[startIdx].isDigit() || currentInput[startIdx] == '.')) {
                startIdx--
            }

            // Adjust the indices
            startIdx++
            endIdx++

            // Extract the most recent number
            val numberStr = currentInput.substring(startIdx, endIdx)

            if (numberStr.isNotEmpty()) {
                val operatorIndex = startIdx - 1
                val modifiedInput: String

                if (operatorIndex >= 0) {
                    val operator = currentInput[operatorIndex]
                    modifiedInput = if (operator == '-') {
                        // Replace the minus operator with a plus
                        currentInput.substring(0, operatorIndex) + '+' + numberStr + currentInput.substring(endIdx)
                    } else if (operator == '+') {
                        // Replace the plus operator with a minus
                        currentInput.substring(0, operatorIndex) + '-' + numberStr + currentInput.substring(endIdx)
                    } else {
                        // If the operator is neither plus nor minus, add a minus sign
                        currentInput.substring(0, startIdx) + "-$numberStr" + currentInput.substring(endIdx)
                    }
                } else {
                    // If there is no operator before the number, add a minus sign
                    modifiedInput = currentInput.substring(0, startIdx) + "-$numberStr" + currentInput.substring(endIdx)
                }

                // Update the input text view
                setInputTextView(modifiedInput)
                clearInputStr()
                appendInputStr(modifiedInput)
            }
        }
    }
}
