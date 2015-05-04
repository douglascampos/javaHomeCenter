package main.java.br.com.codenight.homecenter.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Place {

	private @Id @GeneratedValue Long id;
	private String name;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	private List<Sensor> sensors = new ArrayList<Sensor>();
	
	@Deprecated
	public Place(){
		name = null;
	}
	
	public Place (String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addSensor(Sensor sensor){
		sensors.add(sensor);
	}
	
	public List<Sensor> getSensors() {
		return sensors;
	}
}
