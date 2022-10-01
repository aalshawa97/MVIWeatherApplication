package com.example.mviweatherapplication

sealed class CounterViewEffect : ViewEffect() {
    object NavigateToSecondScreen : CounterViewEffect()
}