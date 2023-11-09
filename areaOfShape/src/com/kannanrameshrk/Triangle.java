package com.kannanrameshrk;

public class Triangle extends Shape {


	public Triangle(float base, float height) {
		super(base , height);
	}
	
	public float area() {
		return (float) (0.5 * this.getLength() * this.getWidth());
	}
	
}
