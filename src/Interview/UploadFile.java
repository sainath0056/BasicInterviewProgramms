package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//stalagad.IGATEGEGDC//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		WebElement src_path=driver.findElement(By.xpath("//input[@name='uploadfile_0']"));
		src_path.sendKeys("C:\\Users\\stalagad.IGATEGEGDC\\Desktop\\sai.html");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.name("send")).click();
	}

}
