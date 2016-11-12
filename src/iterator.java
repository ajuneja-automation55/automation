import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.collect.Sets.SetView;
import com.thoughtworks.selenium.webdriven.commands.GetText;


public class iterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Set<String> test = new HashSet<String>();
		System.out.println(test.size());
		test.add("lapi");
		test.add("PC");
		test.add("mobile");
		test.add("mobile");
System.out.println(test.size());
Iterator<String> it=test.iterator();

while(it.hasNext())
{
	System.out.println(it.next());
	
}*/
		/**********************Second Example**********************/
		/***First***/
		WebDriver driver =new FirefoxDriver();
		Set<String> test= driver.getWindowHandles();
		System.out.println(test.size()+"_____"+"Windows Number");
		/*Second*/
		WebDriver driver1 =new FirefoxDriver();
		driver1.get("http://in.rediff.com/");
		Set<String> test1= driver1.getWindowHandles();
		Iterator<String> it =test1.iterator();
		System.out.println(test1.size()+"_____"+"Windows Number");
		System.out.println(it.next());
		String t=it.next();
System.out.println(t);


		
		
		
		
	
		
		
		
		
		
	}

}
