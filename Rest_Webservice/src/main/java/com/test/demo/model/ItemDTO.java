package com.test.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemDTO 
{
	@Id
	private int id;
	private int price;
	private String description;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", price=" + price + ", description=" + description + ", brand=" + brand + "]";
	}

}
