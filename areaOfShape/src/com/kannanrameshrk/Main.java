package com.kannanrameshrk;

public class Main {

	public static void main(String[] args) {
		
		Shape sq = new Square(12.0f);
		Shape ret = new Rectangle(5,10);
		Shape tri = new Triangle(10,12);
		
		System.out.println("Rectangle area: "+ret.area());
		System.out.println("Triangle area: "+tri.area());
		System.out.println("Square area: "+sq.area());
		
	}

}
