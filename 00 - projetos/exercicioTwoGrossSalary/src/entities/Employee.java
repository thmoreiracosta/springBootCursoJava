package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double imposto;
	
	public double netSalary() {
		return grossSalary - imposto;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", netSalary());				
	}

}
