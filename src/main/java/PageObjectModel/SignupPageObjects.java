package PageObjectModel;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {

public WebDriver driver;
 private By FirstName=By.xpath("//input[@name='UserFirstName']");
 private By LastName=By.xpath("//input[@name='UserLastName']");
 private By WorkEmail=By.xpath("//input[@name='UserEmail']");
 private By Company=By.xpath("//input[@name='CompanyName']");
 private By Phone=By.xpath("//input[@name='UserPhone']");
 private By JobTitle=By.xpath("//select[@name='UserTitle']");
 private By Employees=By.xpath("//select[@name='CompanyEmployees']");
 private By Country=By.xpath("//select[@name='CompanyCountry']");
  

public SignupPageObjects(WebDriver driver2) {
	this.driver=driver2;
}

public WebElement EnterFirstName() {
	  return driver.findElement(FirstName);
  }
  
  public WebElement EnterLastName() {
	  return driver.findElement(LastName);
  }
  
  public WebElement EnterWorkEmail() {
	  return driver.findElement(WorkEmail);
  }
  public WebElement EnterCompany() {
	  return driver.findElement(Company);
  }
  public WebElement EnterPhone() {
	  return driver.findElement(Phone);
  }

  public WebElement SelectJobTitle() {
	  return driver.findElement(JobTitle);
  }
  
  public WebElement SelectEmployees() {
	  return driver.findElement(Employees);
  }
  
  public WebElement SelectCountry() {
	  return driver.findElement(Country);
  }
  

}
