<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
		dist/css/bootstrap.css">
</head>
<body>
	<h1>Statistiques</h1>
	<table>
		<tr>
			<th>Chemin</th>
			<th>Nombre de visites</th>
			<th>Min (ms)</th>
			<th>Max (ms)</th>
			<th>Moyenne (ms)</th>
		</tr>
		<tr>
			<td><c:set name="chemin" value="${VisiteWeb.chemin}"/></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</body>
</html>