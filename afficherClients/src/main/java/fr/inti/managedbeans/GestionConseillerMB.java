package fr.inti.managedbeans;

import java.util.List;

import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.inti.dao.IDaoConseiller;
import fr.inti.entities.Conseiller;

@Controller(value="gestionConseiller")
@SessionScoped
public class GestionConseillerMB {

	@Autowired
	private IDaoConseiller daoConseiller;
	
	public GestionConseillerMB() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public List<Conseiller> listeConseillers(){
		return daoConseiller.getAllConseillers();
	}

	
}
