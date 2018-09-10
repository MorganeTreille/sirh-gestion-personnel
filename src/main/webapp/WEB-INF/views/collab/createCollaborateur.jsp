<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SGP - App</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
		dist/css/bootstrap.css">
	</head>
	<body>
		<h1>Nouveau Collaborateur</h1>
		<div class="container">
			<form name="formulaire" method="post">													
				<div class="form-group">
					<label for="nom">Nom</label>
					<input type="text" name="nom" required/>
					<span class="erreur"></span>			
				</div>
				
				<div class="form-group">
					<label for="prenom">Prénom</label>
					<input type="text" name="prenom" required/>
				</div>
				
				<div class="form-group">
					<label for="dateNaissance">Date de naissance</label>
					<input type="date" name="dateNaissance" required/>
				</div>
				
				<div class="form-group">
					<label for="adresse">Adresse</label>
					<input type="text" name="adresse" required/>
				</div>
				
				<div class="form-group">
					<label for="numSecuSocial">Numéro de sécurité sociale</label>
					<input type="text" name="numSecuSocial" required/>	
				</div>
							
				<div class="form-group">
					<input type="submit" class="btn-primary" value="Créer"/>
				</div>		
			</form>
		</div>
	</body>
</html>