package application;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Product p = new Product("TV", 1000.0, 10);
		
		 p.addProducts(2);
		
		//System.out.println("Novo estoque = " + novoEstoque);
		
	}

}
