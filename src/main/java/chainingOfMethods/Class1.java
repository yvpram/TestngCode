package chainingOfMethods;

public class Class1 {
	String  firstname;
	String  lastname;
	String  fullname;
	public Class1 setfname(String firstname) {
		this.firstname=firstname;
		return this;
	}
	public Class1 setLname(String lastname) {
		this.lastname=lastname;
		return this;
	}
	public String getFullname() {
		return firstname+ " "+ lastname;
	}
}
