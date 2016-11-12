import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;


public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
ranmethod r =new ranmethod();

		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		WebDriverWait wait =new WebDriverWait(driver,15);
		//for (int i=0;i<=5;i++)
			//{
			//String receive = Long.toString(r.test());
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib"))).sendKeys("Automation");
		//System.out.println(receive);
		//}
		
		

	}

}
