import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class practice {

	/**
	 * @param args
	 */
	@Test
	
	public void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver .get("http://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='leftcontainer']/table"));
		String match="TarmatL";
	List<WebElement> pick=driver.findElements(By.tagName("td"));
		for(WebElement cell:pick)
		{
			assertEquals(match, cell.getText());
		
		}
		
		

		
		
		
			
		
		

	}

	private static void assertEquals(String match, String text) {
		// TODO Auto-generated method stub
		
	}

}
