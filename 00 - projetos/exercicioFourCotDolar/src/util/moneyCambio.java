package util;

public class moneyCambio {
	
	public static double IOF = 0.06;
	
	public static double calcDolarReal(double precoDolar, double compDolar) {
		return (precoDolar * compDolar * (1.0 + IOF));	
		
	}

}
	
