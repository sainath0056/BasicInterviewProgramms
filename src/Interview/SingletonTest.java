package Interview;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SingletonTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		DriverInitSingleton instanceDriver=DriverInitSingleton.getInstance();
		driver=instanceDriver.openbrowser();
		
	}
	
	@Test
	public void testMethod() {
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
	}
	
    @AfterMethod
    public void quitBrowser() {
    	driver.quit();
    	
    }
}
