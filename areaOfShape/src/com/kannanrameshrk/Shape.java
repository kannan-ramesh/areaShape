package com.kannanrameshrk;

abstract public class Shape {
	 private double length;
	 private double width;
	 private double side;
	 
	 Shape(float length, float width){
		 this.length= length;
		 this.width=width;
	 }
	 Shape(float side){
		 this.setSide(side);
	 }
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	abstract public float area();
}
