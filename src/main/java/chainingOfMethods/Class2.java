package chainingOfMethods;

public class Class2 {
	String  fullname;
	
	public Class2 setflname(String fullname) {
		this.fullname=fullname;
		return this;
	}
	public void Display() {
		System.out.println(fullname);
	}
}
