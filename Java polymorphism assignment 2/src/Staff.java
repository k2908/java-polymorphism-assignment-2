
public class Staff {
	private static staffMember stafflist[];
	
		
	
	public static void main(String[] args) {
		staffMember[] stafflist =new staffMember[8];
		stafflist[0]= new Commission("Kweku", "Kasoa", "54545116861", "jikjn545840051", 6.25, 0.2,35,400);
		stafflist[1]= new Commission("Kofi", "mallam", "56461656565", "jknlk5458455051", 9.75, .15,40,950);
	
		for(int i =0;i<2;i++) {
			System.out.println(stafflist[i].toString());}
		}
	
	
	
	public void payday() {
	}
}
