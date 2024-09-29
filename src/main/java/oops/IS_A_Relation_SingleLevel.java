package oops;

class parent{
	public void pAssets() {
		int carcount =5;
		System.out.println(carcount);
	}
	public void pAssets1() {
		int housecount =1;
		System.out.println(housecount);
	}
}
class children extends parent{
	@Override
	public void pAssets() {
		int carcount =7;
		System.out.println("carcount "+carcount);
	}
	public void cAssets() {
		int housecount =2;
		System.out.println("housecount "+housecount);
	}
}

public class IS_A_Relation_SingleLevel {

	public static void main(String[] args) {
		children che= new children();
		che.cAssets();
		che.pAssets();
		che.pAssets1();
		parent par= new children();// children class is override all methods from parent class
		par.pAssets1();
		par.pAssets();
		//par.Assets1(); it is not possible because Assets1() not present in parent class 
		
		
	}

}
