package javaprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int number=5;
		for (int i=1; i<=number; i++ ) {
			factorial=factorial*i;
		}
		System.out.println("factorial number is :"+factorial);
	}
}
