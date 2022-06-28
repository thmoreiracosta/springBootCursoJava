package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec;
		rec = new Rectangle();		
		
		System.out.println("Enter rectangle width and height: ");
		rec.width = sc.nextDouble();
		rec.height = sc.nextDouble();
		
		double areaRec = rec.area();
		double perRec = rec.perimeter();
		double diagRec = rec.diagonal();
		
		
		System.out.printf("AREA = %.2f%n", areaRec);
		System.out.printf("PERIMETER = %.2f%n", perRec);
		System.out.printf("DIAGONAL = %.2f%n", diagRec);
				
				
		sc.close();
		

	}

}
