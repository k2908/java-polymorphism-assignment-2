
public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	public Commission(String name,String address,String phone, String socialSecurityNumber,double hourlyPayRate,double commissionRate,int hoursWorked,double totalSales) {
		super(name, address, phone, socialSecurityNumber, hourlyPayRate,hoursWorked);
		this.commissionRate=commissionRate;
		this.totalSales=totalSales;
		
	}
	public void addSales(double totalSales) {
		this.totalSales = totalSales;

	}
	
	
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" his total sales are " +totalSales;
	}
	
	
	public double pay() {
		double commissionSales=commissionRate*totalSales;
		
		return super.pay()+commissionSales;}
	
	}
	

