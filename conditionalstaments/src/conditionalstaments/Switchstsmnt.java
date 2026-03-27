package conditionalstaments;

import java.util.Scanner;

public class Switchstsmnt {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter day num 1-7");
		int day = scanner.nextInt();
		switch (day) {
		   case 1:
			    System.out.println("monday");
			    break;
		   case 2:
			   System.out.println("tuesday");
			   break;
		   case 3:
			   System.out.println("wed");
			   break;
		   case 4:
			   System.out.println("thuurd");
			   break;
		   case 5:
			   System.out.println("friday");
			   break;
		   case 6:
			   System.out.println("sarurday");
			   break;
		   case 7:
			   System.out.println("sunday");
			   break;
		   default:
			   System.out.println("no day");
		}
		scanner.close();
		
	}
}
				   
	
	
	
			