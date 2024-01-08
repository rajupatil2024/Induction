package com.Basics1;

import java.util.Scanner;

public class MainShape {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of shape \n(1 - Rectangle, 2 - Triangle, 3 - Circle): ");
        int choice = sc.nextInt();

        Shape shape = null;
        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.print("Enter the height of the rectangle: ");
                double height = sc.nextDouble();
                shape = new Rectangle(width, height);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triHeight = sc.nextDouble();
                shape = new Triangle(base, triHeight);
                break;
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        if (shape != null) {
            area = shape.area();
            System.out.println("Area of the selected shape: " + area);
        }

        sc.close();
    }

	

}
