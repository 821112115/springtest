package com.test.www.test;

abstract class EvolutionFigure {
	
	abstract double area();
}
class Circle extends EvolutionFigure {
	
	final double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		
		return Math.PI*radius*radius;
	}
}


class Rectangle extends EvolutionFigure {
	final double length;
	final double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	double area() {
		
		return width*length;
	}
	
}