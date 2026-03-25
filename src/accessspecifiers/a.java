package accessspecifiers;

public class a {
	
	public static String name = "public name";
	private static String name1 = "private name";
	protected static String name2 = "protected name";
	public static void main(String[] args) {
		//access specifiers public private protected
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
	}
}