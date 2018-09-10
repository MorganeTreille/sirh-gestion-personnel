package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String Adresse;
	private String numSecuSocial;
	private String emailPro;
	private String photo;
	private ZonedDateTime creation;
	private Boolean actif;
	private String intitulePoste;
	private Departement departement;
	
	
	
	
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(LocalDate dateDeNaissance) {
		this.dateNaissance = dateDeNaissance;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getNumSecuSocial() {
		return numSecuSocial;
	}
	public void setNumSecuSocial(String numeroSecu) {
		this.numSecuSocial = numeroSecu;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public ZonedDateTime getCreation() {
		return creation;
	}
	public void setCreation(ZonedDateTime creation) {
		this.creation = creation;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public String getIntitulePoste() {
		return intitulePoste;
	}
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	
}
