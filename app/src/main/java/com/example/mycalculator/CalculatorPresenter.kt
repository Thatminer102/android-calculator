package com.example.mycalculator

class CalculatorPresenter:CalculatorContract.Presenter {
    private lateinit var mModel: CalculatorModel
    private lateinit var mView:CalculatorContract.View

    override fun setView(view: CalculatorContract.View) {
        mView = view
    }

    override fun start() {
        mModel = CalculatorModel()
    }

    override fun doCalculation(cmd: String) {
        mModel.expString = cmd

        val res = mModel.performCalculation()
        mView.setOutputTextView(res)
    }

}