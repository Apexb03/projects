
abstract class Customer {
	int customerID;
	String customerName;
	long phoneNum;
	float billAmount;
	public Customer(int customerID, String customerName, long phoneNum, float billAmount) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.phoneNum = phoneNum;
		this.billAmount = billAmount;
	}
}

class RegularCustomer extends Customer{
	RegularCustomer(int customerID,String customerName,long phoneNum,float billAmount)
	{
		super(customerID,customerName,phoneNum,billAmount);
	}
	void printCustomerInfo(){
		System.out.println("Customer ID:" +customerID);
		System.out.println("Customer Name:" +customerName);
		System.out.println("Customer Phone No:" +phoneNum);
		System.out.println("Bill Amount:" +billAmount);
	}
	void computeBillAmount(){
		int revisit = 0;
		double discount;
		float bill;
		discount=billAmount*0.3;
		bill=(float) (billAmount-discount);
		System.out.println("Discounted Bill:" +bill);
		System.out.println("----------");
		if(revisit==1)
			revisitDiscount();
		revisit=1;
	}
	void revisitDiscount(){
		System.out.println("Customer Revisited" );
		double revisitDis;
		float revisitBill;
		revisitDis=billAmount*0.8;
		revisitBill=(float) (billAmount-revisitDis);
		System.out.println("Bill After Revisit:" +revisitBill);
		System.out.println("----------");
		System.out.println("----------");
		System.out.println("PRIVILEGED CUSTOMERS DETAILS:");
	}
	
}
class PrivilegedCustomer extends Customer{
	PrivilegedCustomer(int customerID,String customerName,long phoneNum,float billAmount)
	{
		super(customerID,customerName,phoneNum,billAmount);
	}
	void printCustomerInfo(){
		System.out.println("Customer ID:" +customerID);
		System.out.println("Customer Name:" +customerName);
		System.out.println("Customer Phone No:" +phoneNum);
		System.out.println("Bill Amount:" +billAmount);
	}
	void computeBillAmount(){
		double discount;
		float bill;
		discount=billAmount*0.5;
		bill=(float) (billAmount-discount);
		System.out.println("Discounted Bill:" +bill);
		System.out.println("----------");
	}
}