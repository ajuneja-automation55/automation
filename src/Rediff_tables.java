import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;


public class Rediff_tables {

	/**
	 * @param args
	 */
	static WebDriver driver =null;
	
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("http://money.rediff.com/gainers");
		WebDriverWait wait =new WebDriverWait(driver,5);
		//String com= "Megri t";
		List<WebElement> compnayname= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]")));
	System.out.println("test "+compnayname.size());
	String a="//*[@id='leftcontainer']/table/tbody/tr/td[" ;
	
			String b="]";	
	/*for(int i=0;i<=compnayname.size();i++)
		
		{
			//String gettext =compnayname.get(i).getText();
			//System.out.println(gettext);
			if(com.equals(compnayname.get(i).getText()))
			{
				System.out.println(compnayname.get(i).getText());
				break;
			}
			else
			{
				System.out.println("Not Found");
			}
			*/
		
		
			int rows =driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
			int col =driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
			System.out.println("print");
			System.out.println("rows "+rows);
			System.out.println("cols "+col);
		int i=0;
			for(i=1;i<rows;)
		{
			List<WebElement> getnameofcompany=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]"));
		String rec=getnameofcompany.get(i).getText();
		System.out.println(rec);
		 i++;
		}
			
	
		}

	
	}

