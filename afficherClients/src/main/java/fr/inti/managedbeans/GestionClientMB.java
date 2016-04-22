package fr.inti.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;

import fr.inti.dao.DaoClientImpl;
import fr.inti.dao.IDaoClient;
import fr.inti.entities.Client;

@Controller(value="gestionClient")
@SessionScoped
public class GestionClientMB implements Serializable{

	private List<Client> clients;
	@Autowired
	private IDaoClient daoClient;
	private Client client;
	private int id;
	
	
	




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public GestionClientMB() {
		super();
		
		this.client=new Client();
		this.id=0;
	}

	
	public List<Client> getClients(){
		return daoClient.getAllClients();
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addClient(){
		daoClient.addClient(client);
	}
	
	public void clientById(){
		setClient(daoClient.getClientById(id));
	}
	
	public void effacerClient(Client cli){
		daoClient.deleteClient(cli);
	}
	
	public void modifierClient(){
		
	}
}
