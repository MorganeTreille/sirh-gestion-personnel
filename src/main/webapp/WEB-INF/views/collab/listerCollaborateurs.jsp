<%@ page import="java.util.List"%>
<%@ page import="dev.sgp.entite.*"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
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
		
		<c:forEach var="c" items="${listeCollab}">
			<img src="../assets/images/avatar.jpg">
			<li>${c.nom}</li>
			<li>${c.prenom}</li>
			<li>${c.dateNaissance}</li>
			<li>${c.adresse}</li>
			<li>${c.emailPro}</li>
			<li>${c.numSecuSocial}</li>
			<li>${c.matricule}</li>
			<li>${c.creation}</li>
		</c:forEach>
		</ul>
	</body>
</html>