package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

// ------------ auto suggested dropdowns ------------------

public class Dropdown_3_1 {

	WebDriver driver;

	public Dropdown_3_1(WebDriver driver) {
		this.driver = driver;

	}

	public void run() {

		/*
		 * this class is for dropdown which contain a input field and the user have to
		 * select a field based on the server return resuls accroding to their input
		 * keys. Keys provide all necessary keyboard button actions for selenium;
		 * 
		 * ----------- here thread given for delay to avoid any exceptions during
		 * selenium access the element;
		 */
		driver.get("https://www.biman-airlines.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("select2-departure2-container")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[class='select2-search__field']")).sendKeys("DHA");
		driver.findElement(By.cssSelector("input[class='select2-search__field']")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("select2-arrival2-container")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("input[class='select2-search__field']")).sendKeys("B");
		driver.findElement(By.cssSelector("input[class='select2-search__field']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input[class='select2-search__field']")).sendKeys(Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

}
