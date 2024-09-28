package fileReadTest;

import org.testng.annotations.Test;

public class InvocationCountRestAPI1 {
	@Test( invocationCount = 5)
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
	@Test
	public void addUser() {
		System.out.println(" adding is user ");
	}

}
