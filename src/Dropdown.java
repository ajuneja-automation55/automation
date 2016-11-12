import java.util.List;

import junit.framework.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.*;


public class Dropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	WebDriver web =new FirefoxDriver();
	web.get("file:///C:/Users/Arpit/Desktop/auto.html");
	web.manage().window().maximize();
//web.findElement(By.linkText("Google")).click();
//web.navigate().back();
WebElement test= web.findElement(By.id("SelectID_One"));

test.sendKeys("Yellow");
//Assert.assertEquals("Green", )
WebElement test2= web.findElement(By.id("SelectID_Two"));

test2.sendKeys("Lime");

WebElement test3= web.findElement(By.id("SelectID_Three"));

test3.sendKeys("Mouse");
}
}

