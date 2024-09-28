package chainingOfMethods;

public class MethodsChaining {
	String  firstname;
	String  lastname;
	String  fullname;
	public void fname(String firstname) {
		this.firstname=firstname;
	}
	public void lname(String lastname) {
		this.lastname=lastname;
	}
	public void flname() {
		this.fullname=firstname+" "+lastname;
	}
	public void Display() {
		System.out.println(fullname);
	}
	public static void main(String[] args) {
		MethodsChaining mc= new MethodsChaining();
		mc.fname("ram");
		mc.lname("y");
		mc.flname();
		mc.Display();
	}
}
