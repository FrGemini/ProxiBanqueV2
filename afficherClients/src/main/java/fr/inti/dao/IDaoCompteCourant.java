package fr.inti.dao;

import java.util.List;

import fr.inti.entities.CompteCourant;

public interface IDaoCompteCourant {
	
	CompteCourant getCompteByIdCompte(int idCompte);
	
	CompteCourant getCompteByIdClient(int idClient);
	
	void create(CompteCourant compte);
	
	void update(CompteCourant compte);
	
	void delete(CompteCourant compteCourant);
	List<CompteCourant> selectAll();
	
	List<CompteCourant> lowSolde();

	List<CompteCourant> highSolde();
}
