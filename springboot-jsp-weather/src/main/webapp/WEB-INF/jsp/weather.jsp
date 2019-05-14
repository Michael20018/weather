<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Enjoy Weather Demo!</title>
<link href="/css/main.css" rel="stylesheet">
<script src="/js/main.js"></script>
<script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
</head>
<body onload='getWeather();'>
	<h2 class="page-title">Weather in Australia</h2>
	<div class='selectCls'>
		<select id="selectedCity" onchange="getWeather();">
		  <option value ="Sydney" selected='true'>Sydney</option>
		  <option value ="Melbourne">Melbourne</option>
		  <option value="Wollongong">Wollongong</option>
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