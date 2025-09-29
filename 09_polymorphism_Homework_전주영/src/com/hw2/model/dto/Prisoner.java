package com.hw2.model.dto;

public class Prisoner extends Person{
	
	private String crime;

	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}
	
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return super.toString() + " , 죄목 : " + crime;
	}

}
