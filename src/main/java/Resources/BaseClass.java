package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
   public Properties prop;
	public WebDriver driver;
	public WebDriver browserLaunch() throws IOException {
		//to read the data.properties file
	
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
	
	//this will help us to access the data.properties file
	 prop=new Properties();
	
	prop.load(fis);
	
	String browserName=prop.getProperty("browser");
	
	if (browserName.equalsIgnoreCase("chrome")) {
   WebDriverManager.chromedriver().setup();//this will run with  latest chrome browser in your system
		 //WebDriverManager.chromedriver().driverVersion("103.5").setup();//this will run with past chrome version
    
    driver=new ChromeDriver();

	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		//firefoxcode
	}
	 
	else if(browserName.equalsIgnoreCase("edge")) {
		//edgecode
	}
	
	else {
	
	System.out.println("please select valid browser");
	}
	
	return driver;
	
	}
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		browserLaunch();
		driver.get(prop.getProperty("url"));
		}
	
	@AfterMethod
	public void tearDown() throws IOException {
		
		driver.quit();
		}

	
}
