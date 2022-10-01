package com.example.mviweatherapplication.presentation

import com.example.mviweatherapplication.domain.util.Resource
import com.example.mviweatherapplication.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}