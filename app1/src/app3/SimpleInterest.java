package app3;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Price");
		int p = sc.nextInt();
		
		System.out.println("Enter Time (in months)");
		int t = sc.nextInt();
		
		System.out.println("Enter Rate of interest");
		double r = sc.nextDouble();
		
		double si = (p*t*r)/100;
		
		System.out.println(si);
	}
}
