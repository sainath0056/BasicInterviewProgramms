package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn {
	WebDriver driver;

	@BeforeTest
	public void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(dataProvider="searchData")
	public void LinkedInSearch(String username,String password) throws InterruptedException {
		driver.get("https://www.linkedin.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		// Sign in to LinkedIn with Email Address and Password
		WebElement emailAddress = driver.findElement(By.xpath("//*[@id='username']"));
		emailAddress.sendKeys(username);
		WebElement Password = driver.findElement(By.xpath("//*[@id='password']"));
		Password.sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement mouseOverTo = driver.findElement(By.xpath("//input[@class='search-global-typeahead__input always-show-placeholder']"));
		Actions action = new Actions(driver);
		action.moveToElement(mouseOverTo).click().build().perform();
		Thread.sleep(3000);
		mouseOverTo.sendKeys("Sales" + "\n");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//header[@class='msg-overlay-bubble-header']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-controls='experience-level-facet-values']")).click();
		System.out.println("data entered Sucessfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", driver.findElement(By.xpath("//input[@type='checkbox' and @id='experience-4']")));
		action.sendKeys(Keys.ENTER);
		System.out.println("Link Clicked");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement img=driver.findElement(By.xpath("//img[@class='nav-item__profile-member-photo nav-item__icon ember-view']"));
		action.moveToElement(img).click().build().perform();
		System.out.println("done....");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signOut =driver.findElement(By.xpath("//a[@id='ember38']"));
		action.moveToElement(signOut).click().build().perform();
		


	}
	@DataProvider(name="searchData")
	public Object[][] credentials() {
		return new Object[][] { {"sainath0056@gmail.com","linkedin25"} };
	}
	@AfterTest
	public void quitBrowswer() {
		driver.quit();
	}

}
