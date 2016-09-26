
public class ItemDetails {
	private int iItemID;
	private double dItemPrice;
	public ItemDetails(int iItemID) {
		super();
		this.iItemID = iItemID;
	}
	public int getiItemID() {
		return iItemID;
	}
	public double getdItemPrice() {
		return dItemPrice;
	}
	int validateItemID(){
		if(iItemID==1001)
			dItemPrice=1000;
		if(iItemID==1002)
			dItemPrice=300;
		if(iItemID==1003)
			dItemPrice=800;
		if(iItemID==1004)
			dItemPrice=2000;
		if(iItemID==1005)
			dItemPrice=150;
		if(iItemID!=1001 && iItemID!=1002 && iItemID!=1003 && iItemID!=1004 && iItemID!=1005){
			dItemPrice=0;
			System.out.println("Item doesn't exist");
		}
		return (int) (dItemPrice);
		
	}
	void displayItemDetails(){
		System.out.println("Item ID:" +iItemID);
		System.out.println("Item Price:" +dItemPrice);
	}
}
