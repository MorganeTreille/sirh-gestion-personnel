package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;


public class CreateCollaborateurController extends HttpServlet {
	
	public static final String VUE = "/WEB-INF/views/collab/createCollaborateur.jsp";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(req, resp);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {		
		
		String nom =  req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String dateNaissance = req.getParameter("dateNaissance");
		String adresse = req.getParameter("adresse");
		String numSecuSocial = req.getParameter("numSecuSocial");
		String emailPro = prenom + "." + nom +"@societe.com";
		int number = 0;
		String matricule = "M" + ++number;
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		boolean actif = true;
		
		
		
		List<String> listeError = new ArrayList<String>();
		boolean error = false;
		
		if (nom == null) {
			error = true;
			listeError.add("Veuillez entrer votre nom");
		}
		
		if (prenom == null) {
			error = true;
			listeError.add("Veuillez entrer votre prénom");
		}
		
		if (dateNaissance == null) {
			error = true;
			listeError.add("Veuillez entrer votre date de naissance");
		}
		
		if (adresse == null) {
			error = true;
			listeError.add("Veuillez entrer votre adresse");
		}
		
		if (numSecuSocial == null || numSecuSocial.length() != 15) {
			error = true;
			listeError.add("Veuillez entrer un muméro de sécurité social à 15 chiffres");
		}
		
		if (error == true){
			resp.sendError(400, "Il manque des informations :" + listeError);
		} else {
		
			Collaborateur collaborateur = new Collaborateur();
			collaborateur.setNom(nom);
			collaborateur.setPrenom(prenom);
			collaborateur.setDateNaissance(LocalDate.parse(dateNaissance));
			collaborateur.setAdresse(adresse);
			collaborateur.setNumSecuSocial(numSecuSocial);
			collaborateur.setCreation(dateHeureCreation);
			collaborateur.setEmailPro(emailPro);
			collaborateur.setPhoto("../assets/images/avatar.jpg");
			collaborateur.setActif(actif);
			collaborateur.setMatricule(matricule);
			
			CollaborateurService collabService = Constantes.COLLAB_SERVICE;
			collabService.sauvegarderCollaborateur(collaborateur);
			
			resp.sendRedirect("lister");
		}
	}
}
