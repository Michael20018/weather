package com.weather.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Michael
 */
@Controller
public class WeatherController {
	@Value("${spring.weather.city}")
    private String city;
	
	@Value("${openweather.apikey}")
	private String apikey;
	
    @GetMapping({"/"})
    public String hello(HttpServletRequest request, HttpServletResponse response) {
    	request.setAttribute("city", this.city);
    	request.setAttribute("apikey", this.apikey);
        return "weather";
    }
}
