package com.jspider.car_dekho_casestudy_hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="carinfo")
public class Car {

	@Id
	private int id;
	private String name;
	private String model;
	private String brand;
	private String fuletype;
	private double price;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getFuletype() {
		return fuletype;
	}



	public void setFuletype(String fuletype) {
		this.fuletype = fuletype;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		
		return ""+id+"\t\t"+name+"\t\t"+model+"\t\t"+brand+"\t\t"+fuletype+"\t\t"+price+"";
		
	}

}
