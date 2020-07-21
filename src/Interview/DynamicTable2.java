package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable2 {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//stalagad.IGATEGEGDC//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
	//WebElement tabledriver=	driver.findElement(By.tagName("table"));
		WebElement tableRow=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
		System.out.println(tableRow.getText());
		WebElement cellvalue=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
		System.out.println(cellvalue.getText());
		//driver.close();
	}

}
