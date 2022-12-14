package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton_4 {
	WebDriver driver;
	
	RadioButton_4(WebDriver driver){
		this.driver =  driver;
	}
	
	public void run() {
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// findElements reutrn multiple elements with having same xpath
		// findElements have one method named size which return how many elements the functions return;
		// all the radioboxes have same locator value thats why it count all and return size 
		
		
		int len = driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for (int i = 0;i<len;i++) {
			
			
			String name = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(name);
			//dont use  == 
			if(name.equals("Cheese")) {
				
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		driver.quit();
		
	}
	

}
