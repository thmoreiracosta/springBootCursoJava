package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() {		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
		//return this.quantity;
		}

}
