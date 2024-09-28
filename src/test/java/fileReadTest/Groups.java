package fileReadTest;

import org.testng.annotations.Test;

public class Groups {
	@Test( groups = {"sanaty","regration"})
	public void delateUser() {
		System.out.println(" delate is user ");
	}
	@Test( groups = {"sanaty","regration","function"})
	public void updateUser() {
		System.out.println(" update is user ");
	}
	@Test( groups = {"function","regration"})
	public void getUser() {
		System.out.println(" get is user ");
	}
	@Test( groups = {"regration"})
	public void addUser() {
		System.out.println(" adding is user ");
	}

}
