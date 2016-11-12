package test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AmericanGolf {

	/**
	 * @param args
	 */
	static WebDriver driver;
	public static void main(String[] args) {
		int sum=0;
driver= new FirefoxDriver(); 
		driver.get("http://www.americangolf.co.uk/golf-clubs/sets-of-irons");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@id='secondary']/div[1]/div[3]/h3/span")).click();
		
	/*	WebElement web = driver.findElement(By.xpath(".//*[@id='secondary']/div[1]/div[3]/div[1]/ul/li[i]/a/span[2]"));
		
		String get= web.getText();
		String finl=get.replaceAll("\\(", "").replaceAll("\\)","");
		int integer = Integer.parseInt(finl);
		System.out.println(integer);
		*/
		/*text*/
	String txt1=".//*[@id='secondary']/div[1]/div[3]/div/ul/li[";
	String txt2="]/a/span[1]";
		
		/*Count*/
		String link1 =".//*[@id='secondary']/div[1]/div[3]/div[1]/ul/li[";
	String link2="]/a/span[2]";
	int i=1;
	while(isElementPresent(link1+i+link2))	
		{
		WebElement txtloc =driver.findElement(By.xpath(txt1+i+txt2));
		String rece=txtloc.getText();
		
		

		String text =driver.findElement(By.xpath(link1+i+link2)).getText();
		//String get= driver.getText();
		String finl=text.replaceAll("\\(", "").replaceAll("\\)","");
		int integer = Integer.parseInt(finl);
	
		System.out.println(rece+"-"+integer);
		sum =sum+integer;
		i++;
		}
	System.out.println("****************");
	System.out.println("final prodct is-"+sum);
	System.out.println("****************");
	
	}
	
		

	public static boolean isElementPresent(String element_xpath){
		int count = driver.findElements(By.xpath(element_xpath)).size();
		
		if(count == 0)
			return false;
		else
			return true;
	}
		

	

}
