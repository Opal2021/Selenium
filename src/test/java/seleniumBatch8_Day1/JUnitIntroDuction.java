package seleniumBatch8_Day1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitIntroDuction {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This is running before Class");

	}
	
	
	//Junit annatoation
	@Before
	public void beforeTest() {
		
		System.out.println("This is running before test ");
		
	}
	@Test
   public void test1() {
		
		System.out.println("i am test 1");
		
	}
	@Ignore
	@Test
   public void test2() {
		
		System.out.println("I am test 2");
		
	}
	@After
public void afterTest() {
	
	System.out.println("This is running after test ");
	
}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This is running after Class");

	}
	
	
	}
