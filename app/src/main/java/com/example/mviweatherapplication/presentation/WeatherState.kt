package com.example.mviweatherapplication.presentation

import com.example.mviweatherapplication.domain.weather.WeatherInfo
//import com.plcoding.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
