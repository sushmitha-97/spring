package com.xworkz.chocolate;

public class Chocolate {

	private String name;
	private double prize;
	private String brand;
	private String size;

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", prize=" + prize + ", brand=" + brand + ", size=" + size + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void taste() {// method
		System.out.println("chocolate is sweet");
	}

}
