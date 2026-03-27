package conditionalstaments;

import java.util.Scanner;

public class Calculator { 
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double num1 = scanner.nextDouble();
		
		System.out.println("enter the operator (+,-,*,/)");
		char operator = scanner.next().charAt(0);
		
		System.out.println("enter th second number");
		double num2 = scanner.nextDouble();
	
		double result;
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			System.out.println("result:" + result);
			break;
		case'-':
			result = num1-num2;
			System.out.println("result" + result);
			break;
		case'*':
			result = num1*num2;
			System.out.println("result" + result);
			break;
		case'/':
			if (num2 !=0) {
				result = num1 / num2;
			System.out.println("result " + result);
		
			}else {
				System.out.println("error");
			}
			break;
			default:
				System.out.println("invalid number");
		}
		scanner.close();
	}
}