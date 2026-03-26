package javaprograms;

import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
	int no=0,a=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any num");
	no=sc.nextInt();
	if (no<0) {
		no=no* -1;
	}
	else if (no==0) {
		no=1;
	}
	while(no>0) {
		no=no/10;
		a++;
		System.out.println("num of digits given is :"+a);
	}
}
}


