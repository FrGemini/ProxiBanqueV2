package fr.inti.services;

import java.util.List;

import fr.inti.dao.DaoClientImpl;
import fr.inti.dao.IDaoClient;
import fr.inti.entities.Client;

public class ServiceClientImpl implements IServiceClient{

	private IDaoClient daoClient;
	
	
	
	public ServiceClientImpl(IDaoClient daoClient) {
		super();
		this.daoClient = daoClient;
	}



	public List<Client> listeClient() {
		return daoClient.getAllClients();
	}

}
