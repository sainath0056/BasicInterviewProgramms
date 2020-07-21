package Interview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DunamicTable3 {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//stalagad.IGATEGEGDC//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		
		List<WebElement> row_table=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		
		int rowCount=row_table.size();
		System.out.println(rowCount);
		
		//Loop will execute till the last row of table.
    	for (int row = 0;row < rowCount; row++) {
    	    //To locate columns(cells) of that specific row.
    		List < WebElement > Columns_cells = driver.findElements(By.xpath("/html/body/table/tbody//td"));
    		//To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_cells.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_cells.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
    	}
		
		
		
	}

}
