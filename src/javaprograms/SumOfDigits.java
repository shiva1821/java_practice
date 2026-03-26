package javaprograms;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		int sumofDigits=calculatesumOfDigits(number);
		System.out.println("Sum of Digits" +  number+  "is:"  +sumofDigits);
	}
	public static int calculatesumOfDigits(int number ) {
		int sum=0;
		while (number>0) {
			int digit = number%10;
			sum= sum+digit;
			number=number/10;
		}
		return sum;
	}
}
		
