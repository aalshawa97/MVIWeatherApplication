package com.example.mviweatherapplication

import androidx.constraintlayout.motion.utils.ViewState

data class CounterViewState(
    val counterValue: Int = 0
) : ViewState() {
    val counterValueText: String = "$counterValue"
}