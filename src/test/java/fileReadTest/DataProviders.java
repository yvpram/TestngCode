package fileReadTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@DataProvider(name= "single")
	public Object[]  singleObjects() {
		Object[] ob= {1,2,3,4};
		System.out.println(ob+"*******");
		
		return ob;
	}
	
	@DataProvider(name="double",parallel = true)
	public Object[][]  doubleObjects() {
		Object[][] ob2= {{1,2,3,4}, {5,6,7,9,},{4,5,6,7,8,9,40}};
		System.out.println(ob2);
		return ob2;
	}
	@DataProvider(name="iterator")
	public Iterator<Integer>  iteratorObjects() {
		Iterator<Integer> it= new ArrayList<Integer>(Arrays.asList(123,546,48)).iterator();
		return it;
	}
	
	@Test(dataProvider = "single" )
	public void delateUser(int id) {
		System.out.println(" delate is user ");
	}
	@Test(dataProvider = "double" , threadPoolSize = 3)
	public void updateUser(Object[] ob) {
		System.out.println(" update is user ");
		for (Object objects : ob) {
			System.out.println(objects);
		}
	}
	@Test(dataProvider = "iterator")
	public void getUser(Integer in) {
		System.out.println(" get is user ");
		System.out.println(in);
	}
	@Test
	public void addUser() {
		System.out.println(" adding is user ");
	}
}
