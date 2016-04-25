package fr.inti.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Conseiller;

@Repository
@Transactional
public class DaoConseillerImpl implements IDaoConseiller{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	public DaoConseillerImpl() {
		
	}



	public List<Conseiller> getAllConseillers() {
		return sessionFactory.getCurrentSession().createQuery("from conseiller").list();
	}
	
}
