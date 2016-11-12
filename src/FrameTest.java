import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertThat;
public class FrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://www.seleniumframework.com/Practiceform/");
WebElement getvalue=driver .findElement(By.id("vfb-12"));
/*List<WebElement> getlinks= driver.findElements(By.tagName("a"));
int sizecheck= getlinks.size();
System.out.println("Done"+sizecheck);
System.out.println(getlinks.get(4).getText());
for(int i=0;i<=5;i++)
{
	System.out.println(getlinks.get(i).getText());
}
System.out.println("Completed");
	*/
Select drop = new Select(getvalue);
drop.selectByValue("Option 3");


	}

	
		
	}


