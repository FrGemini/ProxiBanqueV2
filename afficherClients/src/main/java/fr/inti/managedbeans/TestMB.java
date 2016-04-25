package fr.inti.managedbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.RequestScoped;

import org.springframework.stereotype.Controller;

@Controller(value="testMB")
@RequestScoped
public class TestMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Integer> idList;

	public TestMB() {
		this.idList = new ArrayList<Integer>();
		this.idList.add(1);
		this.idList.add(2);
		this.idList.add(3);
		this.idList.add(4);
		this.idList.add(5);
		this.idList.add(6);
		this.idList.add(7);
		this.idList.add(8);
		this.idList.add(9);
		this.idList.add(10);
	}

	public List<Integer> getIdList() {
		return idList;
	}

	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}
	
	
	
	
}
