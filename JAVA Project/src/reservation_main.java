
public class reservation_main extends bus {
	
	public static void main(String[] Args) {
		System.out.println("\t\tBlue Bus");
		System.out.println("----------------------------------------------------");
		System.out.println("Welcome to our Bus ticket reservation portal");
		
		System.out.println("Enter user details\n");
		
		get_details detail = new get_details();
		detail.takinginput();
		
		functioning function = new functioning();
		function.run();	
	}
}
