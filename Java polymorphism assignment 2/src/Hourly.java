
public class Hourly extends Employee {
	private int hoursWorked;
public Hourly(String name, String address, String phone, String socialSecurityNumber, double hourlyPayRate,int hoursWorked) {
		super(name, address, phone, socialSecurityNumber, hourlyPayRate);
		this.hoursWorked=hoursWorked;
	}
public void addHours(int moreHours) {
	hoursWorked=moreHours;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+" after working for "+hoursWorked+" hours";
}
@Override
public double pay() {
	// TODO Auto-generated method stub
	return super.pay()+hoursWorked*payRate;
}

}
