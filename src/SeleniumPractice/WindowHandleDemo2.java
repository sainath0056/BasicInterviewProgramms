package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		String mainwindow=driver.getWindowHandle();
		System.out.println("MainWindow:"+mainwindow);
		Set<String> set= driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String childwindow=itr.next();
			if(mainwindow!=childwindow) {
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
	}

}
