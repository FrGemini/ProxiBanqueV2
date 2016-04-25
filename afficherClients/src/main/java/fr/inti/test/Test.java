package fr.inti.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import fr.inti.dao.DaoCompteEpargneImpl;
import fr.inti.dao.DaoConseillerImpl;
import fr.inti.dao.IDaoClient;
import fr.inti.dao.IDaoConseiller;
import fr.inti.entities.Client;
import fr.inti.entities.Conseiller;
import fr.inti.services.IServiceClient;
import fr.inti.services.ServiceClientImpl;

public class Test {


	public static void main(String[] args) {
		
		IDaoConseiller daoConseiller=new DaoConseillerImpl();
		
		for (Conseiller cons: daoConseiller.getAllConseillers()){
			System.out.println(cons.toString());
		}
	}
}
