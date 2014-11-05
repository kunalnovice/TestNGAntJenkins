import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test_1 {

	//
	@Test
	public void testLogin(){
		
		System.out.println("Testing Login test case");
		
	}
	
	
	@Test
	public void testUserregisteration(){
		
		System.out.println("Testing User registeration");
	}
	
	@BeforeMethod
	public void Openbrowser(){
		
		System.out.println("Open broswser");		
	}
	
	@BeforeTest
	public void openDb(){
		
		System.out.println("Open db connection");
	}
	
	@AfterMethod
	public void Closebrowser(){
		
		System.out.println("Close browsers");
		
	}
	
	@AfterTest
	public void closeDB(){
		
		System.out.println("Close db connection");
	}
	
	
	@BeforeSuite //generic for all classes
	public void runSeleniumserver(){
		
		System.out.println("Testing running of selenium server");
	}
	
	@AfterSuite //generic for all classes
	public void stopSeleniumserver(){
		
		System.out.println("Close selenium server");
	}
	
	
	/*
	@BeforeSuite
	             @BeforeTest1
	                 @BeforeMethod1
	                                   @Test_1_1
	                 @AfterMethod1
	                 @BeforeMethod1
                                       @Test_1_2
                     @AfterMethod1
                 @AfterTest1
                 
                 @BeforeTest1
	                 @BeforeMethod2
	                                   @Test_2
	                 @AfterMethod2
	             @AfterTest1
	@After Suite
	*/
	
}
