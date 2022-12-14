package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/* u can write  xpath based on chilld parent relationship 
 it can be written when there is no  unique attribute for a child
 find  parent/grandparent that contains unique attribute then define xpath for that
 then traverse to desired child by /tagname 
 
 */
public class Locators_2_3 {

	// the following code is written for google searchbar
	WebDriver driver;
	public Locators_2_3(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void run() {
		
		driver.get("https://www.google.com/");
		
		/* ---------- parent child traverse ----------------
		 * xpath for grand parent is //div[@class='A8SBwf']/then traverse to child via /tagname
		  //div[@class='A8SBwf']/div/div/div[2]/input
		   
		   div[n] - thats means among the childs of parent which have similar tag select 2nd 
		   
		*/ 
		//div[@class='A8SBwf']
		
		
		driver.findElement(By.xpath("//div[@class='A8SBwf']/div/div/div[2]/input")).sendKeys("selenium")  ;
		
		driver.get("https://rahulshettyacademy.com/blog/");
		
			//div[@id='tve_editor']/div[2]/div/div[3]
		
		driver.findElement(By.xpath("//div[@id='tve_editor']/div[2]/div/div[3]")).click();
		
	
		
		/*
		 * xpath then follow next sibling
		 * xpath/following-sibling::siblingtag[n] n is the sibling number ;
		 * xpath for track back to previous sibling
		 * xpath/preceding-sibling::siblingtag[n]
		
		*/
		
		
	
		
		
		//div[@id='tve_editor']/div[2]/div/div[2]/following-sibling::div[1] 
		driver.findElement(By.xpath("//div[@id='tve_editor']/div[2]/div/div[2]/following-sibling::div[1]")).click();
		
		//div[@id='tve_editor']/div[2]/div/div[3]/preceding-sibling::div[2]
		
		driver.findElement(By.xpath("//div[@id='tve_editor']/div[2]/div/div[3]/preceding-sibling::div[2]")).click();
		
		 
		driver.get("https://rahulshettyacademy.com/blog/");
	
		/*
		 * identify parent by child
		 *childxpath/parent::parenttag
		 
		*/
		//div[@id='tve_editor']/div[2]/div/div[3]/parent::div
		
		 driver.findElement(By.xpath("//div[@id='tve_editor']/div[2]/div/div[3]")).click();
		 
		
		
		// **************** In css we cant go back from child to parent but in xpath we can ************************
		
		/*
		 * identify elements by ui text by xpath
		 *  //tagname[text()='UI TEXT'] ----- UI TEXT must be same as given including space gaps
		 *   
		 *   //*[text()='UI TEXT'] -------------- when tag name doesnt known
		 *    
		 */
		
		/*
		 * CSS IS FASTER THEN XPATH    
		 */
		
		driver.quit();
	}
	
}
