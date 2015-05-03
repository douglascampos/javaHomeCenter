package main.java.br.com.codenight.homecenter.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sensor {

	private @Id @GeneratedValue Long id;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Scanner> scanners = new ArrayList<Scanner>();
	
	private String name;
	
	@Deprecated
	public Sensor() {
		name = null;
	}
	
	public Sensor (String name){
		this.name  = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addScanner(Scanner scanner){
		scanners.add(scanner);
	}
	
	public List<Scanner> getScanners() {
		return scanners;
	}
	
}
