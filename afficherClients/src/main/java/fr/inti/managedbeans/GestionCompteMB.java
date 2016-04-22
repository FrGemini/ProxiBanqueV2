package fr.inti.managedbeans;

import java.io.Serializable;

import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;




import fr.inti.entities.CompteCourant;
import fr.inti.services.IServiceCompteCourant;


@Controller(value="gestionCompte")
@SessionScoped
public class GestionCompteMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//@Autowired
	//private IServiceCompteCourant serviceCompteCourant;
	
	private CompteCourant ccSource;
	private CompteCourant ccDest;
	private float montantVirement;
	
	public GestionCompteMB() {
		super();
		this.ccSource = new CompteCourant();
		this.ccDest = new CompteCourant();
		this.montantVirement = 0;
	}
	
	/******* GETTER - SETTER *******/
	
	public CompteCourant getCcSource() {
		return ccSource;
	}


	public void setCcSource(CompteCourant ccSource) {
		this.ccSource = ccSource;
	}

	public CompteCourant getCcDest() {
		return ccDest;
	}

	public void setCcDest(CompteCourant ccDest) {
		this.ccDest = ccDest;
	}

	public float getMontantVirement() {
		return montantVirement;
	}

	public void setMontantVirement(float montantVirement) {
		this.montantVirement = montantVirement;
	}

	//public IServiceCompteCourant getServiceCompteCourant() {
	//	return serviceCompteCourant;
	//}

	public void virement(){
		//serviceCompteCourant.addMoney(ccDest, montantVirement);
		//serviceCompteCourant.takeMoney(ccSource, montantVirement);
	}
	
}
