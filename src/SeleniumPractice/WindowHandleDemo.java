package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/automation-practice-switch-windows");
		String ParentWindow=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> I1=s.iterator();
		while(I1.hasNext()) {
			String childWindow=I1.next();
		
		if(!ParentWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			driver.close();
		}
		
		}
		driver.switchTo().window(ParentWindow);
//		driver.get("https://toolsqa.com/automation-practice-switch-windows/");
//		 String parentWindowHandle = driver.getWindowHandle();
//		 System.out.println("Parent window's handle -> " + parentWindowHandle);
//		 WebElement clickElement = driver.findElement(By.id("button1")); 
//		 
//		 for(int i = 0; i < 3; i++)
//		 {
//		 clickElement.click();
//		 Thread.sleep(3000);
//		 }
//		 
//		 Set<String> allWindowHandles = driver.getWindowHandles();
//		 
//		 for(String handle : allWindowHandles)
//		 {
//		 System.out.println("Switching to window - > " + handle);
//		 System.out.println("Navigating to google.com");
//		 driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
//		 driver.get("https://google.com");
		 
	}
	}


