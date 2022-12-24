package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObjects;
import Resources.BaseClass;
import Resources.TestCaseData;
import Resources.commonUtilities;

public class VerifySignUpTestCase extends BaseClass  {
@Test
	public void SignUp() throws IOException, InterruptedException {
		
	
	LoginPageObjects lpo=new LoginPageObjects(driver);
	lpo.ClickTryForFree().click();
	Thread.sleep(2000);
	SignupPageObjects spo=new SignupPageObjects(driver);
	spo.EnterFirstName().sendKeys(TestCaseData.FirstName);
	spo.EnterLastName().sendKeys(TestCaseData.LastName);
    spo.EnterCompany().sendKeys(TestCaseData.CompanyName);
    spo.EnterWorkEmail().sendKeys(TestCaseData.WorkEmail);
    spo.EnterPhone().sendKeys(TestCaseData.phone);

    
    commonUtilities.dropdownhandle(spo.SelectJobTitle(),1);
    commonUtilities.dropdownhandle(spo.SelectEmployees(),2);
    commonUtilities.dropdownhandle(spo.SelectCountry(),3);
  
    //driver.getTitle();
    System.out.println(driver.getTitle()) ;
    String actualTitle=driver.getTitle();

    String expectedTitle=TestCaseData.expectedTitle;
    
    commonUtilities.handleSignUpPage( actualTitle, actualTitle);
	
	
	
}
}
