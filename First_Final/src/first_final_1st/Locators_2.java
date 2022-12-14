package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 locators are used :-
 
  #id   --- not common ----- not available for every item
 
 #class name             --- not common ----- not available for every item
 
 #name       --- not common ----- not available for every item
 
 #link text (identify the link by display text)
   --- not common ----- not available for every item  
   
 #Xpath      ************* most common ****  available for every item
 
 #Css        ************* most common ****  available for every item
 
 ***** alpha numeric id will varry in every refresh ************
 
 
 ****** class name with spaces will through error ( compund class names not permited )
 it canot be accessed *****
 
 ***** if multiple item contain  same attribute it will catch the first one ..
      selenium scan from top left *****
 */

public class Locators_2 {
	WebDriver driver;
	public Locators_2(WebDriver driver) {
	this.driver = driver;
	}
	public void run() {
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("This is not a email");
		
		driver.findElement(By.name("pass")).sendKeys("123456789");
		
		driver.findElement(By.linkText("Forgotten password?")).click();

		
	//	driver.get("https://login.salesforce.com/?locale=in");
		
		//driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("this will through an error");
		
		
		
		
		driver.quit();
		
	}

	

}
