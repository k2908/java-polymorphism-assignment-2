
public class Employee extends staffMember {
	
	protected double payRate;
	protected String socialSecurityNumber;
	public Employee(String name, String address, String phone, String socialSecurityNumber, double hourlyPayRate) {
		super(name,address,phone);
		this.payRate=hourlyPayRate;
		this.socialSecurityNumber=socialSecurityNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" at a payrate of "+ payRate+" and with ssn as "+socialSecurityNumber;
	}
	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay()+0;
	}
}
