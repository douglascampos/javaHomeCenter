package br.com.codenight.homecenter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Place {

	private @Id @GeneratedValue Long id;
	
	private String name;
	
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
}
