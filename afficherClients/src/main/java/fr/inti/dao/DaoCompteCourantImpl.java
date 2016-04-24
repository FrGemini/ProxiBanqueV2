package fr.inti.dao;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.inti.entities.CompteCourant;

@Repository
@Transactional
public class DaoCompteCourantImpl implements IDaoCompteCourant {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public CompteCourant getCompteByIdCompte(int idCompte) {
		CompteCourant cc = (CompteCourant) getSession().get(
				CompteCourant.class, idCompte);
		return cc;
	}

	public CompteCourant getCompteByIdClient(int idClient) {
		List<CompteCourant> listeRetour = getSession()
				.createQuery(
						"SELECT cc FROM CompteCourant WHERE CompteCourant.client_id_client=?")
				.setParameter(0, idClient).list();
		return listeRetour.get(0);
	}

	public void update(CompteCourant compte) {
		getSession().update(compte);
	}

	public List<CompteCourant> selectAll() {
		return getSession().createQuery("from courant").list();

	}

	public void create(CompteCourant compte) {
		compte.setDateCreation(new Date());
		getSession().save(compte);
	}

	public void delete(CompteCourant compte) {
		getSession().delete(compte);
	}

	public List<CompteCourant> lowSolde() {
		return getSession().createQuery("SELECT cc FROM CompteCourant WHERE CompteCourant.solde < 0").list();
	}

	public List<CompteCourant> highSolde() {
		return getSession().createQuery("SELECT cc FROM CompteCourant WHERE CompteCourant.solde > 500000").list();
	}

}
