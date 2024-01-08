package com.Basics1;

abstract class Shape {

	public abstract double area();
	}

	class Rectangle extends Shape {
	    private double width;
	    private double height;

	    public Rectangle(double width, double height) {
	        this.width = width;
	        this.height = height;
	    }

	    @Override
	    public double area() {
	        return width * height;
	    }
	}

	class Triangle extends Shape {
	    private double base;
	    private double height;

	    public Triangle(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    @Override
	    public double area() {
	        return 0.5 * base * height;
	    }
	}

	class Circle extends Shape {
	    private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    @Override
	    public double area() {
	        return 3.142 * radius * radius;
	    }
}
