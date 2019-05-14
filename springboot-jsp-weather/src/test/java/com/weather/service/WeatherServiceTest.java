package com.weather.service;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.weather.dto.WeatherDto;

/**
 * @author Michael
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeatherServiceTest {
	@Autowired
    private WeatherService weatherService;

	@Test
    public void getWeatherInfo() {
    	//when
    	Map<String, WeatherDto> weatherMap = new HashMap<String, WeatherDto>();
    	weatherMap = this.weatherService.getWeatherInfo();
    	
    	//then
    	assertNotNull(weatherMap);
    	System.out.println(weatherMap);
    }
}