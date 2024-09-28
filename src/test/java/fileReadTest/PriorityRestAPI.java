package fileReadTest;

import org.testng.annotations.Test;

public class PriorityRestAPI {
	@Test(priority = 3, dependsOnMethods = "addUser")
	public void delateUser() {
		System.out.println(" delate is user ");
	}
	@Test(priority = 2)
	public void updateUser() {
		System.out.println(" update is user ");
	}
	@Test(priority = 2)
	public void getUser() {
		System.out.println(" get is user ");
	}
	@Test(priority = 0)
	public void addUser() {
		System.out.println(" adding is user ");
	}

}
