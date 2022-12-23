package first_final_1st;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_3_2 {

	WebDriver driver;
	
	public Dropdown_3_2(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * this is  for autosearch dropdown
	 * some of autosearch dropdown option is like hidden element
	 * hidden element means the options cant be selected . In the html no portion will shown for the options
	 * 	In this scenario javascript executor will use for retrive value from this kind of hidden object
	 * selenium cannot identify hidden elements
	 *  */
	public void run() {
		
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		Actions actions =  new Actions(driver);
       
		
		actions.moveToElement(driver.findElement(By.xpath("//input[@id='fromPlaceName']"))).click().keyDown(Keys.SHIFT).sendKeys("beng").build().perform();
	
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("beng");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
		String text = "return document.getElementById(\"fromPlaceName\").value;";
		
	String val=	(String) js.executeScript(text);
	
	
	
		
	while(!val.contains("BENGALURU INTERNATION AIRPORT")) {
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		
			
		 val=	(String) js.executeScript(text);
	}
	System.out.println(val);
	driver.quit();
	
	}
		
}


