package arthmetic;
import java.util.Scanner;
public class ArthematicOperators{
	public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	double num1=sc.nextDouble();
	System.out.println("Enter the second number:");
	double num2=sc.nextDouble();
	double sum=num1+num2;
	double difference=num1-num2;
	double mul=num1*num2;
	double quotient= num1/num2;
	System.out.println("the sum of two numbers: "+ sum);
	System.out.println("the difference of two numbers: "+ difference);
	System.out.println("the product of two nubers: "+ mul);
	System.out.println("the quotient of two numbers: "+ quotient);
	}

}
