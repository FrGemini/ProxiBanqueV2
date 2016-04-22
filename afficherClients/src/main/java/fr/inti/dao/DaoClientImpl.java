package fr.inti.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import fr.inti.entities.Client;

@Transactional
public class DaoClientImpl extends HibernateDaoSupport implements IDaoClient {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Client> getAllClients() {
		String reqHqlGetAll = "FROM Client";
		List<Client> clientList = (List<Client>) getHibernateTemplate().find(
				reqHqlGetAll);
		return clientList;
	}

	public void addClient(Client client) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().save(client);
	}

	public Client getClientById(int id) {
		// HQL : Hibernate Query Language
		String reqHqlGetById = "FROM Client WHERE clientId = ?";
		List<Client> clientList = (List<Client>) getHibernateTemplate().find(
				reqHqlGetById, id);
		return clientList.get(0);
	}

	public void deleteClient(Client client) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"delete Client where id = :ID");
		query.setParameter("ID", client.getClientId());
		query.executeUpdate();
		System.out.println("client effacé");

	}

	public void updateClient(Client client) {
		getHibernateTemplate().setCheckWriteOperations(false);
		getHibernateTemplate().update(client);

	}

}
