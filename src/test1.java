import java.time.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {


WebDriver web =new FirefoxDriver();
//String test="{"/"data"/": [{"/"type": "/"articles"/","/"id"/": "/"1"/","/"attributes"/":{"/"title"/":"/"JSON API paints my bikeshed!"/","/"body"/": "/"The shortest article.Ever."/","/"created"/": "/"2015-05-22T14:56:29.000Z"/","/"updated"/": "/"2015-05-22T14:56:28.000Z"/"},"/"relationships"/": {"/"author"/": {"/"data"/": {"/"id"/": "/"42"/", "/"type"/": "/"people"/"}}}}],"/"included"/": [{ "/"type"/": "/"people"/","/"id"/": "/"42"/","/"attributes"/": {"/"name"/": "/"John"/","/"age"/": 80,"/"gender"/": "/"male"/"}}]";
//web.get("file:///C:/Users/Arpit/Desktop/CREATE%20AN%20ACCOUNT.HTML");
web.manage().window().maximize();
//web.findElement(By.id("FirstName")).sendKeys("Arpit");
//web.findElement(By.id("header")).sendKeys(test);




/*DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
Date date =new Date();
String today= dateFormat2.format(date);

WebElement monthElement= web.findElement(By.id("BirthMonth"));
List<WebElement> tes= monthElement.findElements(By.tagName("div"));
for(WebElement qw:tes)
{
 
if(qw.getText().equals(today))
	{
		qw.click();
		break;
	}
else {
	System.out.println("fail");
}
}
	*/
}}

	







