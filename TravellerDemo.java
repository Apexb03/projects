
public class TravellerDemo {

	public static void main(String[] args) {
		Traveller Apeksha = new Traveller(12, 39, 2024, false);
		Checks check = new Checks();
		if(check.checkBaggage(Apeksha) && check.checkImmigration(Apeksha) && check.checkSecurity(Apeksha))
			System.out.println("ALLOW TRAVELLER TO FLY");
		else
			System.out.println("DETAIN TRAVELLER FOR RECHECKING");
	}

}
