package conditionalstaments;

import java.util.Scanner;

public class nestedif {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		String correctUsername = "admin";
		String correctPassword = "12345";
		
		
		System.out.println("Enter name:");
		 
		String username = scanner.nextLine();
		
		
		//==
		if (username.equals(correctUsername)) {
			System.out.println("Enter password:");
			
			String password = scanner.nextLine();
			
			if (password.equals(correctPassword)) {
				System.out.println("login successful");
			}else {
				System.out.println("incorrect password");
			}
		}else {
			System.out.println("incorrect username");
		}
		scanner.close();
	}
}
	
	
	

