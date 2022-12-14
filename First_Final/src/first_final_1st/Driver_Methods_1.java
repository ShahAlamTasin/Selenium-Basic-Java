package first_final_1st;

import org.openqa.selenium.WebDriver;

public class Driver_Methods_1 {
	WebDriver driver;
	public Driver_Methods_1(WebDriver driver) {
		this.driver = driver;
		
	}

	public void run() {
        
		driver.get("http://google.com");  // hit on the url
		
		System.out.println(driver.getTitle()); // get the tittle 
		
		//System.out.println(driver.getCurrentUrl()); // get which url actually hit
		
		driver.navigate().to("http://gmail.com"); // navigate to different URL
				
		System.out.println("navigate to  "+driver.getTitle());
		
		driver.navigate().back(); // back to previous url
		
		System.out.println("after back it goes to  "+driver.getTitle());
		
		driver.navigate().forward();// go forward to the url
		
		System.out.println("after forward it goes to  "+driver.getTitle());
		
		//driver.close(); // it close only focused tab .  doesnt closed child tab
		
		driver.quit(); // it close all tab.
		
		
		
		
	//	System.out.println(driver.getPageSource()); // get all the page elements
		
		
	}
}
