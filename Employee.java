
public class Employee {
	private int iEmpID;
	private String sEmpName;
	private float fEmpBasicSalary;
	private float fAllowance;
	public Employee(int iEmpID, String sEmpName, float fEmpBasicSalary) {
		super();
		this.iEmpID = iEmpID;
		this.sEmpName = sEmpName;
		this.fEmpBasicSalary = fEmpBasicSalary;
	}
	public int getiEmpID() {
		return iEmpID;
	}
	public String getsEmpName() {
		return sEmpName;
	}
	public float getfEmpBasicSalary() {
		return fEmpBasicSalary;
	}
	void calNetSalary(){
		float fTax,fNetSalary;
		fAllowance=(float) (0.46*fEmpBasicSalary);
		System.out.println("Allowance:" +fAllowance);
		
		float fGrossSalary = fAllowance+fEmpBasicSalary;
		System.out.println("Gross Salary:" +fGrossSalary);
		
		if(fGrossSalary<5000){
			System.out.println("No Income Tax");
			fNetSalary=fGrossSalary;
			System.out.println("Net Pay:" +fNetSalary);
		}
		if(fGrossSalary>=5001 && fGrossSalary<10000){
			fTax=(float) (0.1*fGrossSalary);
			System.out.println("Income Tax:" +fTax);
			fNetSalary=fGrossSalary-fTax;
			System.out.println("Net Pay:" +fNetSalary);
		}
		if(fGrossSalary>=10001 && fGrossSalary<20000){
			fTax=(float) (0.2*fGrossSalary);
			System.out.println("Income Tax:" +fTax);
			fNetSalary=fGrossSalary-fTax;
			System.out.println("Net Pay:" +fNetSalary);
		}
		if(fGrossSalary>=20000){
			fTax=(float) (0.3*fGrossSalary);
			System.out.println("Income Tax:" +fTax);
			fNetSalary=fGrossSalary-fTax;
			System.out.println("Net Pay:"+fNetSalary);
		}
	}
	void display(){
		System.out.println("Employee ID:" +iEmpID);
		System.out.println("Basic Salary:" +fEmpBasicSalary);
	}
}
