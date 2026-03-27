package arthmetic;
import java.util.Scanner;
public class Addthreenumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a+b+c ;
		System.out.println("Total " + sum );
		
	}

}
