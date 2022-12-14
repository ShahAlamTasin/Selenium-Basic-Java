package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// contain deatils about xpath and css selector with custom regular expression

public class Locators_2_2 {

	WebDriver driver;
	public Locators_2_2(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void run() {
		/* 
		 * we know that locators(id..) contains alpha numeric value keep changes on every refresh/ hit
		 * sometimes attribute value can be too long to handle
		 * for above cases we can generate our own xpath and css selector with regular expression
		  for xpath  with regular expression -
		   //tagname[contains(@attribute,'value']
		  
		  for Css selector with regular expression - 
		   tagname[attribute*= 'value']
		   
		 */
		
		driver.get("https://www.rediff.com/");
		
		//a[contains(@href,'https://mail.rediff.com/')] -- custom xpath with regular expression
		
		driver.findElement(By.xpath("//a[contains(@href,'https://mail.rediff.com/')]")).click();
		//           input[id = 'login1'] -- custom css selector
		
		driver.findElement(By.cssSelector("input[id = 'login1']")).sendKeys("demo user");
		// input#password --custom css selector
		driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		
		// input[class* = 'signin'] -- custom css selector with regular expression 
		
		driver.findElement(By.cssSelector("input[class*='signin']")).click(); 
		
		driver.quit();
	}
	
}
