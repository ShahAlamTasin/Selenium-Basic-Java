package first_final_1st;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebDriver_Scope_12 {
	WebDriver driver;
	public WebDriver_Scope_12(WebDriver driver) {
		this.driver = driver;
		
	}

	public void run() {
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("text link in the whole page is  " +driver.findElements(By.tagName("a")).size());
		
		WebElement Footerdriver = driver.findElement(By.xpath("//div[@id = 'gf-BIG']"));
		
		/*
		 * here driver is used for full webpage
		 * but footerdriver limit the scope only in the footer section
		 * we can limit the scope and perform all operation like Webdriver functions
		 */
		System.out.println("text link in the  page footer is  "+Footerdriver.findElements(By.tagName("a")).size());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// limit the scope to the element  to the footer first column.
		WebElement first_column_footer =  Footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		int len = first_column_footer.findElements(By.tagName("a")).size();
		
		System.out.println("text link in the  page footer first column   "+len);
	
		// visit each link and open by press ctrl+entr when that element is find;
		for (int i  = 0 ;i<len;i++) {
			String keyforlink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			first_column_footer.findElements(By.tagName("a")).get(i).sendKeys(keyforlink);
		}
		
		Set<String> set = driver.getWindowHandles();
		
		Iterator<String> itr = set.iterator();
		
		
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
	}
}
