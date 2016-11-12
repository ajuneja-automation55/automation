
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class links {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://bbc.com");
		
		List<WebElement> qlink = driver.findElements(By.tagName("a"));
		System.out.println(qlink.size());
		
		WebElement testnum4 = qlink.get(4);
		System.out.println(testnum4.getText());
		System.out.println("complete");
		try{
		for(int i=0;i<=qlink.size();i++)
		{
			System.out.println(qlink.get(i).isDisplayed());
			
		}
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		}
		

	}


