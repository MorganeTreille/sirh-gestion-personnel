<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.entite.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/bootstrap-3.3.7-
		dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Les collaborateurs</h1>
		<div>
			<label>Rechercher un nom ou un prénom qui commence par :</label>
			<input type="text">
			<span>
			<input type ="submit" value="Rechercher">
		</span>
		<span>
			<input type="checkbox" name="check" value = "Voir les collaborateurs désactivés">
			<label for="check">Voir les collaborateurs désactivés</label>
		</span>
		</div>
		
		<div>
			<label>Filtrer par département :</label>
			<select>
				<Option> Comptabilité
				<Option> Ressources Humaines
				<Option> Informatique
			</select>
		</div>
		<ul>
		<%
		List<Collaborateur> listeCollab = (List<Collaborateur>)request.getAttribute("listeCollab");
		for(Collaborateur c : listeCollab) {
		%>
		<img src="../assets/images/avatar.jpg">
		<li><%=c.getNom() %></li>
		<li><%=c.getPrenom() %></li>
		<li><%=c.getDateNaissance() %></li>
		<li><%=c.getAdresse() %></li>
		<li><%=c.getEmailPro() %></li>
		<li><%=c.getNumSecuSocial() %></li>
		<li><%=c.getMatricule() %></li>
		<li><%=c.getCreation() %></li>
		<%
		}
		%>
		</ul>
	</body>
</html>