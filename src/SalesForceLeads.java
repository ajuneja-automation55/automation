import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SalesForceLeads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		
driver.get("http://www.customink.com/lab?ref=nav_btn_v2");
/*driver.findElement(By.id("username")).sendKeys("anu.dhamija55@gmail.com");
driver.findElement(By.id("password")).sendKeys("arPIT4203");

driver.findElement(By.id("Login")).click();*/
WebDriverWait test = new WebDriverWait(driver, 40);
test.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CC']/div[1]/ul/li[1]/a"))).click();
//driver.findElement(By.xpath("//*[@id='CC']/div[1]/ul/li[1]/a")).click();



//driver.findElement(By.id("Lead_Tab")).click();
//driver.findElement(By.xpath(".//a[@id='hotlist']/table/tbody/tr/td[2]/input")).click();
                           // .//*[@id='hotlist']/table/tbody/tr/td[2]/input


	}

}
