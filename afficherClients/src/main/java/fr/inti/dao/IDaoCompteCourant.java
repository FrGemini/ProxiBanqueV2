package fr.inti.dao;

import fr.inti.entities.CompteCourant;

public interface IDaoCompteCourant {
	CompteCourant getCompteByIdCompte(int idCompte);
	CompteCourant getCompteByIdClient(int idClient);
	void update(CompteCourant compte);
}
