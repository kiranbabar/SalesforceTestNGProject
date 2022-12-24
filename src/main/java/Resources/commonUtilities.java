package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonUtilities {

	//this is method for dropdownhandle
	public static void dropdownhandle(WebElement dropDownXpath,int dropdownvalue) {
	
	Select s=new Select(dropDownXpath);
   s.selectByIndex(dropdownvalue);
		
		
		
}

	public static void handleAssertion(String actual,String expected) {
		
	
				
		SoftAssert assertion=new SoftAssert();
		
		assertion.assertEquals(actual, expected);
		
		assertion.assertAll();
	}
		
	public static void handleSignUpPage(String actual,String expected) {
		
	SoftAssert assertion=new SoftAssert();
	
	assertion.assertEquals(actual, expected);
	assertion.assertAll();
	}
	
		
	
	
	
	




}
