package com.obj.model.vo;

public class MyPet {
	public String breed;
	public String name;
	public double weight;
	public int length;
	public String habitat;
	
	public MyPet() {} ;

	public MyPet(String breed, String name, double weight,
			int length, String habitat) {
		this.breed=breed;
		this.name=name;
		this.weight=weight;
		this.length=length;
		this.habitat=habitat;
	}
}
