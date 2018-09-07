package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.getWriter().write("<h1>Edition de collaborateur</h1>");
		
		String matricule = req.getParameter("matricule");
			
		if(matricule == null) {
			resp.sendError(400,"Un matricule est attendu");
		} else {
			resp.getWriter().write("<p> Matricule : " + matricule + "</p>");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.getWriter().write("<h1>Edition de collaborateur</h1>");
		
		String matricule = req.getParameter("matricule");
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		
		if(matricule == null || titre == null || nom == null || prenom == null) {
			
			String paramNotExist = "";
			if (matricule == null){
				paramNotExist += "matricule ";
			}
			if (titre == null){
				paramNotExist += "titre ";
			}
			if (nom == null){
				paramNotExist += "nom ";
			}
			if (prenom == null){
				paramNotExist += "prenom";
			}
			
			resp.sendError(400, "Les paramètres sont incorrects:" + paramNotExist);
			
		} else {
			resp.setStatus(201);
			resp.getWriter().write("<p>Création d'un colalborateur avec les informations suivantes:</p>"
					+ "<p>matricule = " + matricule 
					+", titre = " + titre 
					+ ", nom = " + nom 
					+ ", prenom = " + prenom 
					+ "</P>");
		}
	}
}
