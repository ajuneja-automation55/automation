import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class ListPractice {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://qtpselenium.com/");
		List<WebElement> getHeaderName = driver.findElements(By
				.cssSelector(".nav.navbar-nav.navbar-right>li>a"));
		for (WebElement print : getHeaderName) {
			String GetText=print.getText();
			System.out.println(GetText);

		
	}}

}
