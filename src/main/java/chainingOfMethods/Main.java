package chainingOfMethods;

public class Main {
 public static void main(String[] args) {
	Class1 c1= new Class1();
	Class2 c2= new Class2();
	c2.setflname(c1.setfname("ram").setLname("Y").getFullname()).Display();
}
}
