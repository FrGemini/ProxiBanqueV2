package fr.inti.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Client;
import fr.inti.entities.CompteCourant;

@Repository
@Transactional
public class DaoCompteCourantImpl extends HibernateDaoSupport implements IDaoCompteCourant {
	
	@Autowired
	private SessionFactory sessionFactory;

	public CompteCourant getCompteByIdCompte(int idCompte) {
		// HQL : Hibernate Query Language
		String reqHqlGetById = "FROM CompteCourant WHERE id = ?";
		List<CompteCourant> compteList = (List<CompteCourant>) getHibernateTemplate().find(
				reqHqlGetById, idCompte);
		return compteList.get(0);
	}

	public CompteCourant getCompteByIdClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(CompteCourant compte) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().update(compte);
	}

}
