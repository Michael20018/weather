package com.weather.service.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.weather.dto.WeatherDto;
import com.weather.service.WeatherService;

/**
 * @author Michael
 */
@Service
public class WeatherServiceImpl implements WeatherService{
	/**
     * get weather info
     * @return
     */
    public Map<String, WeatherDto> getWeatherInfo() {
    	Map<String, WeatherDto> weatherMap = new HashMap<String, WeatherDto>();
    	weatherMap.put("Sydney", new WeatherDto("Sydney", "Thursday 11:00 AM", "Mostly Cloudy", 11, 31));
    	weatherMap.put("Melbourne", new WeatherDto("Melbourne", "Thursday 11:00 AM", "Mostly Cloudy", 12, 32));
    	weatherMap.put("Wollongong", new WeatherDto("Wollongong", "Thursday 11:00 AM", "Mostly Cloudy", 13, 33));
    	return weatherMap;
    }
}
