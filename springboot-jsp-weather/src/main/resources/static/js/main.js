//retrieve weather data by Api
function getWeather(){
	let API_KEY = $('#apikey').val();
	let loc = $('#selectedCity').val() + ',AU';
    $.ajax({
        type:"GET",
        url:"http://api.openweathermap.org/data/2.5/weather?q=" + loc,
        data: {
        	units: 'metric',
        	APPID: API_KEY
        },
        success: function(data){
        	var dateObj = new Date();
        	var weekdayName = new Array('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday');
           	$("#cityName").html(data.name);
           	$("#updatedTime").html(weekdayName[dateObj.getDay()] + ' ' + dateObj.getHours() + ':' + dateObj.getMinutes());
           	$("#weather").html(data.weather[0].main);
           	$("#temperature").html(Math.round(data.main.temp) + ' °C');
           	$("#wind").html(Math.round(data.wind.speed * 3.6) + ' km/h');
        },
        error:function(jqXHR){
            console.log("Error: "+jqXHR.status);
        }
    });
}
