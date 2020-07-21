package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInitSingleton {
	
	private static DriverInitSingleton instanceDriver=null;
	private WebDriver driver;
	
	private DriverInitSingleton() {
		
	}
	
  public WebDriver openbrowser() {
	 System.setProperty("webdriver.chrome.driver", "C://Users//stalagad.IGATEGEGDC//Downloads//chromedriver_win32//chromedriver.exe");
	 driver=new ChromeDriver();
	return driver;
	
	  
  }
	//lazy initialization
	public static DriverInitSingleton getInstance() {
		if(instanceDriver==null)
			instanceDriver=new DriverInitSingleton();
		return instanceDriver;
		
	}
}
