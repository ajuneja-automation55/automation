import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.gson.annotations.Until;


public class rediff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
		WebElement box = driver.findElement(By.xpath(".//*[@id='popular_cat']"));
		List<WebElement> block =box.findElements(By.tagName("h3"));
		//String link1 = ".//*[@id='nav']/ul/li[2]/a[";
		//String link2 ="]";
		
		for (int i=0;i<block.size();i++)
		{
			System.out.println(block.get(i).getText().toLowerCase()+"-------"+block.get(i).isDisplayed());
			
			block.get(i).click();
			System.out.println(driver.getTitle());
			driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
			box = driver.findElement(By.xpath(".//*[@id='popular_cat']"));
			block =box.findElements(By.tagName("h3"));
			
			//driver.get("http://shopping.rediff.com/?sc_cid=inhome_icon");
			
		}
		
		System.out.println("____");

		System.out.println("done");
	}

}
