package app3;

import java.util.Scanner;

public class ProductExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product name");
		String productName = sc.nextLine();
		
		System.out.println("Enter the product price");
		double price = sc.nextDouble();
		
		System.out.println("Enter the qty");
		int qty = sc.nextInt();
		
		double totalPrice = price*qty;
		System.out.println("Total price for the product: "+productName+" "+totalPrice);
	}
}
