package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {

	public WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrossBrowser obj=new CrossBrowser();
	WebDriver driver=obj.initDriver("chrome");
	driver.get("http://www.google.com");
		

	}
	
	public WebDriver initDriver(String browser) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.equals("Firefox")) {
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}else {
			System.out.println(browser +"browser not found");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
   
		
		return driver;
	}


}
