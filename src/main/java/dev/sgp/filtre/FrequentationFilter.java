package dev.sgp.filtre;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.VisiteWeb;

public class FrequentationFilter {

	List<VisiteWeb> listeVisite = new ArrayList<VisiteWeb>();
	public void sauvegarderFiltre(VisiteWeb visite) {
		listeVisite.add(visite);
	}
	
	
}
