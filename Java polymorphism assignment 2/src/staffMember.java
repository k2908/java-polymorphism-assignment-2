
public class staffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	public staffMember(String name, String address,String phone) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.address=address;
		this.phone=phone;
		}
	

	@Override
	public String toString() {
		return "the staffMember with name " + name + ", address " + address + ", phone number" + phone + ", has a salary of " + pay();
	}


	
	public double pay() {
		return 0;
		
	}

}
