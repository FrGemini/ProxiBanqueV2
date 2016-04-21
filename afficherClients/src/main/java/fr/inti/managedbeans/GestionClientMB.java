package fr.inti.managedbeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.dao.DaoClientImpl;
import fr.inti.dao.IDaoClient;
import fr.inti.entities.Client;

@ManagedBean (name="gestionClient")
@SessionScoped
public class GestionClientMB implements Serializable{

	private List<Client> clients;
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
		//attention à modifier le path de ton applicationContext.xml (
		//faudra trouver une meilleure solution pour faire marcher tout ça)
		ApplicationContext ctx = new FileSystemXmlApplicationContext(
				"C:\\Users\\inti0297\\gitProxy\\afficherClients\\src\\main\\webapp\\WEB-INF\\applicationContext.xml");
		this.daoClient = (IDaoClient) ctx.getBean("clientDaoBean");
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
