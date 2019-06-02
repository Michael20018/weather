<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
	String cityStr = request.getAttribute("city").toString();
	String[] cityArray = {};
	if(cityStr != null && !cityStr.isEmpty()) {
		cityArray = cityStr.split(",");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enjoy Weather Demo!</title>
<link href="/css/main.css" rel="stylesheet">
<script src="/js/main.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
</head>
<body onload='getWeather();'>
	<input id="apikey" type="hidden" value="<%=request.getAttribute("apikey").toString()%>"/>
	<h2 class="page-title">Weather in Australia</h2>
	<div class='selectCls'>
		<select id="selectedCity" onchange="getWeather();">
		<% for(String city: cityArray){ %>
		  <option value ="<%=city %>"><%=city %></option>
		<% }%>
		</select>
	</div>
    <table>
    <tr>
    	<td>City</td>
    	<td id="cityName"></td>
    </tr>
    <tr>
    	<td>Updated time</td>
    	<td id="updatedTime"></td>
    </tr>
    <tr>
    	<td>Weather</td>
    	<td id="weather"></td>
    </tr>
    <tr>
    	<td>Temperature</td>
    	<td id="temperature"></td>
    </tr>
    <tr>
    	<td>Wind</td>
    	<td id="wind"></td>
    </tr>
    </table>
</body>
</html>