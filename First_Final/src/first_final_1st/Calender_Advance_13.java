package first_final_1st;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calender_Advance_13 {

WebDriver driver;
public Calender_Advance_13(WebDriver driver) {
	this.driver = driver;
}

public void run() {
	
	driver.get("https://www.makemytrip.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
	driver.findElement(By.cssSelector("div[data-cy='outsideModal']")).click();
	driver.findElement(By.cssSelector("li[data-cy='roundTrip']")).click();
	
	driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
	//"parent-cssselector child-cssselector"
		System.out.println(driver.findElement(By.cssSelector("div[class='DayPicker Selectable Range'] div[class='DayPicker-Caption']")).getText());
		
		while(true)
		{
			if(driver.findElement(By.cssSelector("div[class='DayPicker Selectable Range'] div[class='DayPicker-Caption']")).getText().contains("March")) {
				List<WebElement> listfordepart = driver.findElements(By.cssSelector("div[class='dateInnerCell']"));
				
				
				for(int i = 0;i<listfordepart.size();i++) {
					if(listfordepart.get(i).getText().equalsIgnoreCase("23")) {
						driver.findElements(By.cssSelector("div[class='dateInnerCell']")).get(i).click();
						break;
					}
				}
				break;
			}
		
				else {
					driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				}
			
		
			
		}
		while(true) {
			
			if(driver.findElement(By.cssSelector("div[class='DayPicker Selectable Range'] div[class='DayPicker-Caption']")).getText().contains("May")) {
				List<WebElement> listforreturn = driver.findElements(By.cssSelector("div[class='dateInnerCell']"));
				
				
				for(int i = 0;i<listforreturn.size();i++) {
					if(listforreturn.get(i).getText().equalsIgnoreCase("20")) {
						driver.findElements(By.cssSelector("div[class='dateInnerCell']")).get(i).click();
						break;
					}
				}
				break;
			}
			else {
				driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
				
			}
			
		}
		
		
		
		System.out.println(driver.findElement(By.cssSelector("p[data-cy='departureDate']")).getText());
		System.out.println(driver.findElement(By.cssSelector("p[data-cy='returnDate']")).getText());
	
		
}

}
