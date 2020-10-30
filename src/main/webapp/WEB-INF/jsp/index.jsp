<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nombre</title>
</head>
<body>
Introduce el nombre de la persona:
<form action="http://localhost:8080/bananas" method="POST">
	<input type="text" name="nombre">
	<input type="submit" value="enviar">
</form>
</body>
</html>