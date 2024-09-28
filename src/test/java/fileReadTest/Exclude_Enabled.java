package fileReadTest;

import org.testng.annotations.Test;

public class Exclude_Enabled {
	@Test(enabled = false,description = "hi it is")
	public void delateUser() {
		System.out.println(" delate is user ");
	}
	@Test
	public void updateUser() {
		System.out.println(" update is user ");
	}
	@Test
	public void getUser() {
		System.out.println(" get is user ");
	}
	@Test(enabled = true)
	public void addUser() {
		System.out.println(" adding is user ");
	}


}
