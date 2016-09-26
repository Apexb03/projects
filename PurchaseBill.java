
public class PurchaseBill {
	private int iBillID;
	private int iQty;
	private double dBillAmt;
	public PurchaseBill(int iBillID, int iQty) {
		super();
		this.iBillID = iBillID;
		this.iQty = iQty;
	}
	public int getiBillID() {
		return iBillID;
	}
	public int getiQty() {
		return iQty;
	}
	public double getdBillAmt() {
		return dBillAmt;
	}
	ItemDetails item = new ItemDetails(1002);
	void calculateBill(int dItemPrice){
		dBillAmt=iQty*dItemPrice;
		if(iQty<=0)
			System.out.println("No item is purchased");
		if(iQty>=5)
			System.out.println("Please purchase less than 5 items");
		if(iQty>0 || iQty<5)
		{
				if(dBillAmt>=1000)
					dBillAmt=dBillAmt-(dBillAmt*0.1);
				else if(dBillAmt>=500)
					dBillAmt=dBillAmt-(dBillAmt*0.05);
				else if(dBillAmt>0 && dBillAmt<500)
					System.out.println("NO DISCOUNT");
				
		}

	}
	void displayDetails(){
		System.out.println("Bill ID:" +iBillID);
		System.out.println("No of items purchased:" +iQty);
		System.out.println("Bill Amount:" +dBillAmt);
	}
}
