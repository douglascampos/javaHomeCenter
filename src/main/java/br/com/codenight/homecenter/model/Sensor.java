package br.com.codenight.homecenter.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sensor {

	private @Id @GeneratedValue Long id;
	
	private String place;
	private double value = 0;
	private Date date = new Date();
	private String name;
	
	@Deprecated
	public Sensor() {
		place = null;
	}
	
	public Sensor (String place, String name, double value){
		this.place = place;
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
		return place;
	}
	
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}
}
