package app2;

import java.util.Scanner;

import app1.Calculator;

public class AdditionExample extends Calculator {

	public static void main(String[] args) {
		
		AdditionExample c = new AdditionExample();
		
		c.add(20, 50);
		c.sub(40, 30);
//		c.mul(30, 5);
//		c.div(50, 5);
		
		System.out.println("");
	}
}
