package com.kannanrameshrk;

public class Square extends Shape{

	
	
	public Square(float side) {
		super(side);
	}

	public float area() {
		return (float) (getSide() * getSide());
	}
	
	

}
