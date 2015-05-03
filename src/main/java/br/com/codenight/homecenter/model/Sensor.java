package main.java.br.com.codenight.homecenter.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sensor {

	private @Id @GeneratedValue Long id;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Place place;
	
	private String local;
	private double value = 0;
	private Date date = new Date();
	private String name;
	
	@Deprecated
	public Sensor() {
		local = null;
	}
	
	public Sensor (String local, String name, double value){
		this.local = local;
		this.value  = value;
		this.name  = name;
	}
	
	public double getValue(){
		return value;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPlace(){
		return local;
	}
	
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}
	
}
