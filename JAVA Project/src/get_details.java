import java.util.*;

public class get_details {
	
	Scanner s = new Scanner(System.in);
	
	void takinginput() {
		System.out.println("Name:");
		String name = s.next();
		
		System.out.println("Mobile No:");
		Long mob = s.nextLong();
		
		System.out.println("Age:");
		int age = s.nextInt();
		
		System.out.println("Gender:");
		String gender = s.next();
		
		System.out.println("E-mail:");
		String email = s.next();
	}
}
