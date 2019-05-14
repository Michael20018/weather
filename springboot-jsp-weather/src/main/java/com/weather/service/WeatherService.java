package com.weather.service;

import java.util.Map;

import com.weather.dto.WeatherDto;

/**
 * @author Michael
 */
public interface WeatherService {
	public Map<String, WeatherDto> getWeatherInfo();
}
