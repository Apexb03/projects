
public class CustomerDemo {

	public static void main(String[] args) {
		Customer C=new Customer(1, "Apeksha", "Vidyanagar", 1234567891);
		C.displayDetails();
		ItemDetails I=new ItemDetails(1002);
		int iItemPrice=I.validateItemID();
		//I.validateItemID(1002);
		I.displayItemDetails();
		PurchaseBill P=new PurchaseBill(1122,1);
		P.calculateBill(iItemPrice);
		//P.calculateBill();
		P.displayDetails();
	}

}
