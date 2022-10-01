package com.example.mviweatherapplication

import android.content.Intent

sealed class CounterIntent : Intent() {
    object Increase : CounterIntent()
    object Decrease : CounterIntent()
    object NavigateToSecondScreen : CounterIntent()
}