
public class Customer {
	private int iCustID;
	private String sCustName;
	private String sAddress;
	private long lTeleNo;
	
	public Customer(int iCustID, String sCustName, String sAddress, long lTeleNo) {
		super();
		this.iCustID = iCustID;
		this.sCustName = sCustName;
		this.sAddress = sAddress;
		this.lTeleNo = lTeleNo;
	}

	public int getiCustID() {
		return iCustID;
	}

	public String getsCustName() {
		return sCustName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public long getlTeleNo() {
		return lTeleNo;
	}
	boolean validateTeleNo(){
		if((lTeleNo/1000000000)>0 || (lTeleNo/1000000000)<11)
			return true;
		else
			return false;
	}
	boolean validateCustNmae(){
		if(sCustName.length()>=4 || sCustName.length()<=20)
			return true;
		else
			return false;
	}
	void displayDetails(){
		System.out.println("Customer ID:" +iCustID);
		System.out.println("Customer Name:" +sCustName);
		System.out.println("Customer Address:" +sAddress);
		System.out.println("Customer phone Number:" +lTeleNo);
	}
}
