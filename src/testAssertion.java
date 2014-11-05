import junit.framework.Assert;

import org.testng.annotations.Test;


public class testAssertion {

@Test
public void testTitle(){
	
	String expected = "Google";
	String actual = "Goolge";
	
	System.out.println("Beginning");
	
	try{
	Assert.assertEquals(expected, actual);
	}catch(Throwable t){
		System.out.println("Exception caught");
	}
	System.out.println("Ending");
}
	
@Test
public void testLink(){
	
	System.out.println("Clicking on a link");
}
	
}
