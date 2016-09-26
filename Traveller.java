
public class Traveller {
	private int iTravellerID;
	private float fBaggageAmount;
	private int iExpiryYear;
	private boolean bNOCStatus;
	
	public Traveller(int iTravellerID, float fBaggageAmount, int iExpiryYear, boolean bNOCStatus) {
		super();
		this.iTravellerID = iTravellerID;
		this.fBaggageAmount = fBaggageAmount;
		this.iExpiryYear = iExpiryYear;
		this.bNOCStatus = bNOCStatus;
	}

	public int getiTravellerID() {
		return iTravellerID;
	}

	public float getfBaggageAmount() {
		return fBaggageAmount;
	}

	public int getiExpiryYear() {
		return iExpiryYear;
	}

	public boolean isbNOCStatus() {
		return bNOCStatus;
	}
}
