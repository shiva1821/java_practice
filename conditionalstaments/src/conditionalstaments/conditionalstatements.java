package conditionalstaments;
public class conditionalstatements {
	public static void main(String[]args) {
		int age=2;
//		if(age>18) {
//			System.out.println("eligible");
	//	}
	//	else 
	//	{	
	//		System.out.println("not eligible");
		if (age==18)
		{
			System.out.println("you have grown up");
		}
		else if(age<=18)
		{
			System.out.println("you might turn 18 soon");
		}
		else if(age>18)
		{
			System.out.println("you are not");
		}
		else
		{
			System.out.println("something");
	}
	
	
	}
	
}

