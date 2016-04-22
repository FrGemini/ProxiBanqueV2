package fr.inti.services;

import fr.inti.entities.CompteCourant;

public interface IServiceCompteCourant {
	void takeMoney(CompteCourant cc , float montant);
	void addMoney(CompteCourant cc , float montant);
}
