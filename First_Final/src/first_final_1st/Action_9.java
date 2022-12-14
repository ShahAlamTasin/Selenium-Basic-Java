package first_final_1st;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action_9 {
    WebDriver driver;
	public Action_9(WebDriver driver) {
		this.driver =  driver;
		
	}
	
	public void run() {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//div[@class='glow-toaster-content']/div[3]/span[1]/span/input")).click();
		
		Actions action  =  new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("abcd").doubleClick().build().perform();
		
		//keydown means press down the key
		// action.moveElement() will hover the mouse on the element 
		// build will load the action then perform will do the action
		// context click means double click 
		driver.quit();
	}
	
}
