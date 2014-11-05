import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class testFormfill {
	
	
	@Test(dataProvider="getData")
	public void testFormfill(String username , String password, Integer age){
		System.out.println(username +" --- " + password + "  ---  " + age);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		// Selenium framework - read the data from xls file and put it in Object array
		// rows - number of time test has to be repeated
		// cols - number of parameters in test data
		
		Object[][] data = new Object[2][3];
		// 1st row
		data[0][0] = "abc@yahoomail.com";
		data[0][1] = "pass@123";
		data[0][2]  = 23;
		
		// 2nd row 
		data[1][0] = "abcd@gmail.com";
		data[1][1] = "pass@222";
		data[1][2]  = 27;
		
		return data;		
	}

}
