package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_11 {
	
	WebDriver driver;
	
	public Drag_And_Drop_11(WebDriver driver) {
		this.driver =  driver;
		
	}
 public void run() {
	 driver.get("https://jqueryui.com/droppable/");
	 
	 /*
	  * frame is a separate container in a webpage which contains some element that is not actually belong to this webpage
	  * selenium can not identify element in the frame automically.
	  * you  must switch to that frame for access that 
	  * after complete the task in the frame you must back to the normal page
	  * ---------------a frame in a webpage starts with iframe tag----------------------------- 
	  */
	 
	/*
	 * there is 3 ways for switch to  frame 
	 */
	 
	 driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
	 
	 // driver.findElements(By.tagName("iframe")).getSize();-----it returns how many element present in the webpage with that tagname;
	 
	// driver.switchTo().frame(0); ------- after knowing the size we can switch to frame by id ... 0 based index
	 
	// driver.switchTo().frame(); -- we can switch via frame string
	 
	 /*
	  * for drag and drop we need the action class
	  */
	 
	 Actions action  =  new Actions(driver);
	 
	 WebElement source  =  driver.findElement(By.id("draggable"));
	 
	 WebElement destination  =  driver.findElement(By.id("droppable"));
	 
	 action.dragAndDrop(source, destination).build().perform();
	 
	 driver.switchTo().defaultContent();//------ it will back to the original web page from the frame
	 
 }
}
