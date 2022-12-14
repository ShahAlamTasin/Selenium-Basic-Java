package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts_5 {
	WebDriver driver;
	
	
	public Alerts_5(WebDriver driver){
		this.driver = driver;
	}

	public void run() {
		// if the alert box is made of html it can be accessed by xpath like previous
		
		// if the alert box is made of java (do inspect and dont see any html code for the popup) then switch to  alert
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		//  input[value='Confirmation Alert'] 
		driver.findElement(By.cssSelector("input[value='Confirmation Alert']")).click();
		
		System.out.println(driver.switchTo().alert().getText()); // get the alertbox text
		
		driver.switchTo().alert().accept(); // use this if the alert has a possitive response button
		
		//driver.switchTo().alert().dismiss();  //use this if the alert has a nageative response button
		
		//driver.switchTo().alert().sendKeys("demo");  //  use this if the alert has something input;
		driver.quit();
	}
}
