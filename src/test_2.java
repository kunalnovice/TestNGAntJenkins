import org.testng.SkipException;
import org.testng.annotations.Test;


public class test_2 {
	
	
	@Test
	public void testCapturescreeshot(){
		System.out.println("Second test case - screenshot capture");
	throw new SkipException("Skipping the test case");	
		
	}

}
