
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.thoughtworks.selenium.webdriven.Windows;


public class Calender {
	
	/**
	 * @param args
	 */
	static WebDriver driver;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		/******************************************Current Date *************************************************************/	
		driver = new FirefoxDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vfb-8"))).click();
			WebElement ele =driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']"));
				
		Date Currentdate=new Date();
		
		SimpleDateFormat format1 =new SimpleDateFormat("dd/MM/yy");
		
		String test=format1.format(Currentdate);
		System.out.println(test);
		String RequiredDate="14/12/2016";
		String GetMONTHDATE=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
		//String getYear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
		String DisplayMonth =new SimpleDateFormat("mm").format(RequiredDate);
		String DisplayDate= new SimpleDateFormat("yyyy").format(RequiredDate);
		
				
		String ReceivedDateMonth=DisplayMonth+""+DisplayDate;
		System.out.println(ReceivedDateMonth);
		/*Calendar currentDate = Calendar.getInstance();
	    SimpleDateFormat formatter= new SimpleDateFormat("d");
	    currentDate.add(Calendar.DECEMBER, 7);
	    String date1 = formatter.format(currentDate.getTime());
	    System.out.println(date1);*/
	methoddatetime m = new methoddatetime();
	
	//makemytrip	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='start_date_sec']/span[1]/span[1]"))).click();
	
	List<WebElement> cols=ele.findElements(By.tagName("td"));




	for(WebElement cell:cols)
	{
		if(cell.getText().equals(Currentdate))
		{
			cell.click();
			break;
		
		}
		
		
	}
	
		//driver.quit();
		
	/****************************************************End ******************************************************/
	/****************************************************Future Date ******************************************************/
	
	}
}
