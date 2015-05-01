package br.com.codenight.homecenter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperature {

	private @Id @GeneratedValue Long id;
	
	private String place;
	private double temp = 0;
	
	@Deprecated
	public Temperature() {
		place = null;
	}
	
	public Temperature (String place, double temp){
		this.place = place;
		this.temp  = temp;
	}
	
	public double getTemp(){
		return temp;
	}
	
	public String getPlace(){
		return place;
	}
}
