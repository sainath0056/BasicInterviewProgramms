package Interview;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//stalagad.IGATEGEGDC//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/yahoo.html");
		 WebElement downloadButton = driver.findElement(By.xpath("//a[@id='messenger-download']"));
		 String sourceLocation = downloadButton.getAttribute("href");
	        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: Downloads " + sourceLocation;
	
	        try {
	            Process exec = Runtime.getRuntime().exec(wget_command);
	            int exitVal = exec.waitFor();
	            System.out.println("Exit value: " + exitVal);
	            } catch (InterruptedException | IOException ex) {
	            System.out.println(ex.toString());
	            }
	            driver.close();
	            }
	}


