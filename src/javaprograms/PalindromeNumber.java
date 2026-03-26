package javaprograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		
		if (ispalindrome(number)) {
			System.out.println(number+"is a palindrome");
		}
			else {
				System.out.println(number+"not a palindrome");
			}
	}
	public static boolean ispalindrome(int num) {
		int originalNumber=num;
		int reversedNumber=0;
		while (num!=0) {
			int digit=num % 10;
			reversedNumber=reversedNumber*10+digit;
			num=num/10;
		}
		return originalNumber==reversedNumber;
	}
}
			
				
		
