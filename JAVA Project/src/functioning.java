import java.util.*;
public class functioning{
	
	void run() {
		int noofseat;
		Scanner s = new Scanner(System.in);
	
		int m[] = new int[61];
	
		for(int i=1;i<=60;i++) {
			m[i]=i;
		}
		int av_seat = 60;
		int ticketno=1;
	
		while(true) {
			System.out.println("Choose the bus type: \n1:AC bus \t2:Non-AC bus\n");
			int input1 = s.nextInt();
			bus bs = new bus();
		
			System.out.println("No of seats: " + bs.seats);
			System.out.println("Available seats: "+ av_seat + "\n");
		
			System.out.println("Enter the no. of people travelling: ");
			noofseat = s.nextInt();	
			
			av_seat -= noofseat;
			try {
				if(noofseat == 0) {
					throw new ArithmeticException("No. of traveller cannot be zero");
				}
			}
			catch(ArithmeticException e){
				System.out.println("No. of traveller cannot be zero");
				System.exit(0);
			}
		
			int a[] = new int[noofseat+1]; 
			System.out.println("1:Choose Seats \t 2:Continue without choosing");
			int input2 = s.nextInt();
	
	
			if(input2 == 1) {
				for(int i=1;i<=60;i++) {
					System.out.printf("%02d  ", m[i]);
					if(i%4==0) {
						System.out.println("\n");
					}
				}
				for(int i=1;i<=noofseat;i++) {
					a[i]= s.nextInt();
				}	
				for(int i=1;i<=noofseat;i++) {
					for(int j=1;j<=60;j++) {
						if(a[i]==m[j]) {
							m[j]= 00;
						}
					}
				}
			}
			
			
			fare finalfare = new fare();
			finalfare.calfare(input1, noofseat);
			
			System.out.println("Congratulations your ticket has been booked!");
			System.out.println("Your ticket number is:" + ticketno);
			System.out.println("1:Book another ticket?\t\t 2:Exit");
			ticketno++;
			int input3 = s.nextInt();
			if(input3==1) {
				continue;
			}
			else {
				System.exit(0);
			}
		}
	}
}