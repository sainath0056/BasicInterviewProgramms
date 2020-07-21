package SeleniumPractice;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserLogin_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String,String> hs=new HashMap<String,String>();
		hs.put("admin", "Sainath0056@gmail.com_pass@123");
		hs.put("Customer", "ram@gmail.com_56565@123");
		hs.put("lead", "ghgj@gmail.com_yyty@323");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(hs.get("Customer").split("_")[0]);
		driver.findElement(By.id("password")).sendKeys(hs.get("Customer").split("_")[1]);
		
		

	}

}
