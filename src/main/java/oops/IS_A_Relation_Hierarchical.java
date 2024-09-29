package oops;
class parent2{
	public void p2assets() {
		int car=2;
		System.out.println("car "+car);
	}
}
class chaild1 extends parent2{
	@Override
	public void p2assets() {
		int car=2;
		System.out.println("car "+car);
	}

	public void c1assets() {
		int c1car=2;
		System.out.println("c1car "+c1car);
	}
	
}
class chaild2  extends parent2{
	@Override
	public void p2assets() {
		int car=2;
		System.out.println("car "+car);
	}
	public void c2assets() {
		int c1car=3;
		System.out.println("c1car "+c1car);
	}
}
public class IS_A_Relation_Hierarchical {

	public static void main(String[] args) {
		System.out.println("chaild1 assets ");
		chaild1 c1= new  chaild1();
		c1.c1assets();
		c1.p2assets();
		System.out.println("chaild2 assets");
		chaild1 c2= new  chaild1();
		c2.c1assets();
		c2.p2assets();
		System.out.println("parent assets");
		parent2 p2= new parent2();
		p2.p2assets();
		
	}

}
