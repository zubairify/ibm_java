<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String[] cities = {"Mumbai","Pune","Cochin","Goa","Kolkata","Bengaluru"}; %>
<form action="save.do" method="post">
	<table border="2">
		<tr><td>Code</td>
			<td><input name="code"></td>
		</tr>
		<tr><td>From</td>
			<td><select name="from">
				<% for(String ct : cities)  { %>
					<option value="<%=ct %>"><%=ct %></option>
				<%	} %>
			</select></td>
		</tr>
		<tr><td>To</td>
			<td><select name="to">
				<% for(String ct : cities)  { %>
					<option value="<%=ct %>"><%=ct %></option>
				<%	} %>
			</select></td>
		</tr>
		<tr><td>Carrier</td>
			<td><input type="radio" name="carrier" value="Indigo" checked>Indigo
				<input type="radio" name="carrier" value="JetAirways">JetAirways
				<input type="radio" name="carrier" value="AirIndia">AirIndia
			</td>
		</tr>
		<tr><th colspan="2">
			<input type="submit" value="Save Flight">
		</th></tr>
	</table>
</form>
</body>
</html>