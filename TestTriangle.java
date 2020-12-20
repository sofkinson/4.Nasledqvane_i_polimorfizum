package chetvurtoPaketche;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input side a of the triangle");
		double a = sc.nextDouble();
		
		System.out.println("Input side b of the triangle");
		double b = sc.nextDouble();
		
		System.out.println("Input side c of the triangle");
		double c = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Input the color of the triangle");
		String color = sc.nextLine();
		System.out.println("Input if the triangle is filled (true/false)");
		boolean isFilled = sc.nextBoolean();
		
		Triangle triangle = new Triangle(a, b ,c);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		System.out.println(triangle.triangleDescription()+ "\narea: "+ triangle.getArea() + " and perimeter: " + triangle.getPerimeter() + "\n" + triangle.toString());
		
	}

}
