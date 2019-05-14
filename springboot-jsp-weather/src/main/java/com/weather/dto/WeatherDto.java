package com.weather.dto;

/**
 * @author Michael
 */
public class WeatherDto {

	private String cityName;
	private String updatedTime;
	private String weather;
	private int temperature;
	private int wind;
	
	public WeatherDto(String cityName, String updatedTime, String weather,
			int temperature, int wind) {
		this.cityName = cityName;
		this.updatedTime = updatedTime;
		this.weather = weather;
		this.temperature = temperature;
		this.wind = wind;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getWind() {
		return wind;
	}
	public void setWind(int wind) {
		this.wind = wind;
	}
}
