package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;
//We have achieved inheritance here
public class VerifyLoginTestCase extends BaseClass {

	
	@Test
	public void login() throws IOException {
		
		
LoginPageObjects lpo= new LoginPageObjects(driver);

 lpo.EnterUsername().sendKeys(TestCaseData.username);
lpo.EnterPassword().sendKeys(TestCaseData.password);
lpo.ClickLogin().click();

String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();

String expected=TestCaseData.expected;
		
commonUtilities.handleAssertion(actual,expected);
	
	
	
	
	}

}
