package com.kannanrameshrk;

public class Rectangle extends Shape{

	

	public Rectangle(float length, float width) {
		super(length, width);
	}
	
	public float area() {
		return (float) (this.getLength() * this.getWidth());
	}

}
