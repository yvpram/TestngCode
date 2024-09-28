package chainingOfMethods;

public class MethodsChaining1 {
	String  firstname;
	String  lastname;
	String  fullname;
	public MethodsChaining1 setfname(String firstname) {
		this.firstname=firstname;
		return this;
	}
	public MethodsChaining1 setLname(String lastname) {
		this.lastname=lastname;
		return this;
	}
	public MethodsChaining1 setflname() {
		this.fullname=firstname+" "+lastname;
		return this;
	}
	public void Display() {
		System.out.println(fullname);
	}
	public static void main(String[] args) {
		MethodsChaining1 mc= new MethodsChaining1();
		mc.setfname("ram").setLname("y").setflname().Display();
		
	}
}
