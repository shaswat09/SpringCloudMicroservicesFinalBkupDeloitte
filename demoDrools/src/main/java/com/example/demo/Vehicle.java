package com.example.demo;

public class Vehicle {

	private String make;
	private String model;
	private String year;
	private Integer noAccidents;
	
	private Integer price;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNoAccidents() {
		return noAccidents;
	}

	public void setNoAccidents(Integer noAccidents) {
		this.noAccidents = noAccidents;
	}
	
}
