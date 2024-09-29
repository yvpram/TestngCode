package oops;

class parent1{
	public void pAssets() {
		int carCount=3;
		System.out.println("carCount "+carCount);
	}
}
class chaild extends parent1{
	@Override
	public void pAssets() {
		int carCount=3;
		System.out.println("carCount "+carCount);
	}
	
	public void cAssets() {
		int houseCount=5;
		System.out.println("houseCount "+houseCount);
	}
}
class grandChildren extends chaild{

	public void pAssets() {
		int carCount=1;
		System.out.println("carCount "+carCount);
	}
	
	public void cAssets() {
		int houseCount=6;
		System.out.println("houseCount "+houseCount);
	}
	public void gcAssets() {
		int backLogCount=6;
		System.out.println("backLogCount "+backLogCount);
	}
}

public class IS_A_Relation_MultiLevel {

	public static void main(String[] args) {
		grandChildren gc= new grandChildren();
		gc.pAssets();
		gc.cAssets();
		gc.gcAssets();
		chaild c= new chaild();
		c.cAssets();
		c.pAssets();
		parent1 p1= new parent1();
		p1.pAssets();

	}

}
