package com.weather.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weather.dto.WeatherDto;
import com.weather.service.WeatherService;

/**
 * @author Michael
 */
@Controller
public class WeatherController {
	@Autowired
	private WeatherService weatherService;
	
    @GetMapping({"/"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "weather";
    }
    
    /**
     * retrieve weather info by city
     * @param model
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getWeather", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public WeatherDto getWeather(@RequestParam(value="selectedCity", required=true, defaultValue="Sydney") String selectedCity) {
    	//retrieve weather info data
    	Map<String, WeatherDto> weatherMap = this.weatherService.getWeatherInfo();
    	WeatherDto weatherDto = weatherMap.get(selectedCity);
    	
        return weatherDto;
    }
}
