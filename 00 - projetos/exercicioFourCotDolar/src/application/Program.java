package application;

import java.util.Locale;
import java.util.Scanner;

import util.moneyCambio;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double cotDolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double compDolar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", moneyCambio.calcDolarReal(cotDolar, compDolar));
		
			
		
		sc.close();		

	}
}
