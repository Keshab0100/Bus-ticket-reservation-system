
public class fare extends functioning{
	
	void calfare(int input1, int noofseat) {
		int fare;
		
		ac_bus fareac = new ac_bus();
		non_ac_bus farenonac = new non_ac_bus();
		
		if(input1==1) {
			fare = noofseat*(fareac.acFare);
		}
		else {
			fare = noofseat*(farenonac.nonAcFare);
		}

		System.out.println("Your total fare is: " + fare);
	}
}
