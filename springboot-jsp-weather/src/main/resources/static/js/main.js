//retrieve weather data by Api
function getWeather(){
    $.ajax({
        type:"GET",
        url:"getWeather?selectedCity="+$('#selectedCity').val(),
        dataType:"json",
        success: function(data){
           	$("#cityName").html(data.cityName);
           	$("#updatedTime").html(data.updatedTime);
           	$("#weather").html(data.weather);
           	$("#temperature").html(data.temperature);
           	$("#wind").html(data.wind + 'km/h');
        },
        error:function(jqXHR){
            console.log("Error: "+jqXHR.status);
        }
    });
}
