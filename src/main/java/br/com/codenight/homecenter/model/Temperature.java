package br.com.codenight.homecenter.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Temperature {

	private @Id @GeneratedValue Long id;
	
	private String place;
	private double temp = 0;
	private Date date = new Date();
	
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
	
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}
}
