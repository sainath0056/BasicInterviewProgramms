package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//stalagad.IGATEGEGDC//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		//Columns
		List<WebElement>  columns=driver.findElements(By.xpath("//table//tr/th"));
		System.out.println("Columsn :"+columns.size());
		//rows
		List<WebElement>  rows=driver.findElements(By.xpath("//table//tbody/tr"));
		System.out.println("rows :"+rows.size());
		
		driver.close();
		

	}

}
