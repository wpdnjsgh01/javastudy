package prob02;

import java.util.*;

public class Goods {
	
	private String product;
	private int price;
	private int stock;
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public Goods(String product, int price, int stock) {
		
		this.product = product;
		this.price = price;
		this.stock = stock;
		
	}

}
