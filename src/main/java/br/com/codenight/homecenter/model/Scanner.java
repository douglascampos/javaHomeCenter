package main.java.br.com.codenight.homecenter.model;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Scanner {

	private @Id @GeneratedValue Long id;
	private double value = 0;
	private String date;
	
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
	
	public String getDate(){
		return date;
	}
	
}
