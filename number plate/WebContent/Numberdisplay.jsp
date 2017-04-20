<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1 align="center">VEHICLE NUMBER</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="green">
<h1 align="right"><a href="log.html"><input type="submit" value="Logout"></a></h1>
<h2 align="center"><%=request.getAttribute("nump") %></h2>
<h1 align="center"><a href="location.html"><input type="submit" value="OK"></a></h1>
</body>
</html>