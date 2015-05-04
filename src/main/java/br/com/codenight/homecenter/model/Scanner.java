package main.java.br.com.codenight.homecenter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Scanner {

	private @Id @GeneratedValue Long id;
	private double value = 0;
	private String date;
	
//	@ManyToOne(cascade=CascadeType.PERSIST)
//	private Place place;
	
//	@ManyToOne(cascade=CascadeType.PERSIST)
//	private List<Sensor> sensors = new ArrayList<Sensor>();
//	
	@Deprecated
	public Scanner() {
		value = 0.0;
		date = "";
	}
	
	public Scanner(double value, String date) {
		this.value = value;
		this.date = date;
	}
	
	public double getValue() {
		return value;
	}
	
//	public double getId() {
//		return id;
//	}
	
	public String getDate(){
		return date;
	}
	
//	public Place getPlace(){
//		return this.place;
//	}
	
}
