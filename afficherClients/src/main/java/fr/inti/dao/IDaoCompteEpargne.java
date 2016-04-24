package fr.inti.dao;

import java.util.List;

import fr.inti.entities.CompteEpargne;

public interface IDaoCompteEpargne {
	CompteEpargne getCompteByIdCompte(int idCompte);
	
	CompteEpargne getCompteByIdClient(int idClient);
	
	void create(CompteEpargne compteEpargne);
	
	void update(CompteEpargne compteEpargne);
	
	void delete(CompteEpargne compteEpargne);
	
	List<CompteEpargne> selectAll();
}
