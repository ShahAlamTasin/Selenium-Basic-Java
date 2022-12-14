package first_final_1st;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_8 {

	WebDriver driver;
	
	public Wait_8(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void run() {
		
		/*
		 * --------- implicit wait -------------------
		 * implicit wait  defined globally for a class . no condition
		 * if implicit wait time limit is 5s that means it will wait for the item to load its data for 5 seconds withoout 
		 withoout throwing any exception ,this is max time limnit .. if item load at 3 seconds  it doesnt wait 5 seconds to complete
		 */
		
		
		driver.get("https://www.booking.com/index.html?aid=378266;label=bdot-Nd4rUhyH392mEJGHxa5acAS461500239550:pl:ta:p1:p22,563,000:ac:ap:neg:fi:tikwd-7241929306:lp1001441:li:dec:dm:ppccp=UmFuZG9tSVYkc2RlIyh9YYriJK-Ikd_dLBPOo0BdMww;ws=&gclid=Cj0KCQiA4aacBhCUARIsAI55maFtkwZN6PafDk0VvKcj-UPWmNSA_uUnbyByE8qI_yTBVQH4e_81H8IaAi-GEALw_wcB");
		
		driver.findElement(By.id("ss")).click();
		
		driver.findElement(By.id("ss")).sendKeys("DHA");
	
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	
		/*
		 *    --------- explicit wait --------------
		 *    target specific item , not full class 
		 *    have specific condition
		 */
		
		WebDriverWait driver_wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
	    driver_wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[data-i='1']")));
		
		driver.findElement(By.cssSelector("li[data-i='1']")).click();
		
	//******** explicitly wait to load the result after enter DHA , it will be not applicable for another one by default
	//******* if you want to apply, use the driver_wait object again for that element 
		
		driver.quit();
		
		// synchronization  of explicit and implicit is best
		
		/*
		 * Thread.sleep requires no logic
		 * if wait 5 second and the element  load at 3 second  it will wait 5 second to complete  
		 */
		
	}
}
