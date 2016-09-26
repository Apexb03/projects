
public class Checks {
	boolean checkBaggage(Traveller Apeksha){
		if(Apeksha.getfBaggageAmount()>=0 && Apeksha.getfBaggageAmount()<=40)
			return true;
		else
			return false;		
	}
	boolean checkImmigration(Traveller Apeksha){
		if(Apeksha.getiExpiryYear()>=2001 && Apeksha.getiExpiryYear()<=2025)
			return true;
		else
			return false;
	}
	boolean checkSecurity(Traveller Apeksha){
		if(Apeksha.isbNOCStatus()==true)
			return true;
		else
			return false;
	}
}
