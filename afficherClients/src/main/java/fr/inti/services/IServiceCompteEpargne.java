package fr.inti.services;

import java.util.List;

import fr.inti.entities.CompteEpargne;

public interface IServiceCompteEpargne {
	List<CompteEpargne> selectAll();
	void takeMoney(CompteEpargne ce , float montant);
	void addMoney(CompteEpargne ce , float montant);
}
