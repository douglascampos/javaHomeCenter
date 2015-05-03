package main.java.br.com.codenight.homecenter.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Scanner {

	private @Id @GeneratedValue Long id;
	private double value = 0;
	private Date date = new Date();
	
	@Deprecated
	public Scanner() {
		value = 0.0;
	}
	
	public Scanner(double value, Date date) {
		this.value = value;
		this.date = date;
	}
	
	public double getValue() {
		return value;
	}
	
	public String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		return sdf.format(date);
	}
	
}
