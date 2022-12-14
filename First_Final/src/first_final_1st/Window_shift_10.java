package first_final_1st;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


// when one element is  in a window is responsible for create another  window in another tab ... the first one is parent and second child
public class Window_shift_10 {
	WebDriver driver;
	
	public Window_shift_10(WebDriver driver) {
		this.driver = driver;
	}
	
	public void run() {
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1811737581%3A1670091884619212&continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=AddSession");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[contains(@href,'support.google.com')]")).click();
		
		Set<String> win_set=  driver.getWindowHandles();
		// getwindowhandles will return a set of windows Id
	
		System.out.println(win_set.size());
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		 * in the set 
		 * itr  at first point to the top+1 index
		 * in the set the first next  it will point to parent  which is the top
		  * in the set the 2nd next it will point to child come from parent
		 * in the set the 3rd next it will point to child come from previous child
		 * acts like a queue ---fifo
		 */
		
		Iterator<String> itr = win_set.iterator();
		
		// for traverse the set we need iterator
		
		String parentId = itr.next();
        String childId = itr.next();
        driver.switchTo().window(childId); // switch to child window
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	

}
