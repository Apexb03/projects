
public class CustomerDemo {

	public static void main(String[] args) {
		int i,j;
		RegularCustomer[] r = new RegularCustomer[2];
		r[0]=new RegularCustomer(1001, "Ape", 1234567891, 500);
		r[1]=new RegularCustomer(1001, "Ape", 1234567891, 1000);
		for(i=0;i<r.length;i++){
			r[i].printCustomerInfo();
			r[i].computeBillAmount();
		}
		for(i=0;i<r.length;i++){
			for(j=i+1;j<r.length;j++)
			{
				if(r[i].customerID==r[j].customerID)
					r[i+1].revisitDiscount();
			}
		}
		PrivilegedCustomer[] p = new PrivilegedCustomer[3];
		p[0]=new PrivilegedCustomer(1003, "Apa", 1234567893, 200);
		p[1]=new PrivilegedCustomer(1004, "Akhi", 1234567894, 800);
		p[2]=new PrivilegedCustomer(1005, "Aka", 1234567895, 1200);
		for(i=0;i<p.length;i++){
			p[i].printCustomerInfo();
			p[i].computeBillAmount();
		}
		
	}
}
