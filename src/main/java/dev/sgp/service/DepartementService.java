package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public class DepartementService {

	private List<Departement> listeDepartement = new ArrayList<Departement>();
	
	Departement comptabilite = new Departement("Comptabilité");
	Departement ressourcesHumaines = new Departement("Ressources Humaines");
	Departement informatique = new Departement("Informatique");
	Departement administratif = new Departement("Administratif");
	
	
	
	public List<Departement> listerDepartement() {
		return listeDepartement;
	}
}
