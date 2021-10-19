package lab;

import java.util.ArrayList;

public class Receipt {
	
	private ArrayList<Product> purchasedProducts;
	private double total;
	
	
	public Receipt() {
		this.purchasedProducts = new ArrayList<Product>();
		this.total = 0;
	}
	
	public void addProduct(Product p) {
		purchasedProducts.add(p);
		this.total += p.getPrice();
	}
	
	
	public double getTransactionTotal() {
		return this.total;
	}
	
	public String toString() {
		return "";
	}

}
