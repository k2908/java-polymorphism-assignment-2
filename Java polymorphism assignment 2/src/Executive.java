
public class Executive extends Employee {
	private double bonus;
	public Executive(String name, String address, String phone, String socialSecurityNumber, double hourlyPayRate, double bonus) {
		super(name, address, phone, socialSecurityNumber, hourlyPayRate);
		this.bonus=bonus;
	}
	
	public void awardBonus(double execBonus){
		
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return super.pay()+bonus;
	}

}
