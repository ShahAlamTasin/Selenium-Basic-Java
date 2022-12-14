package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Calender_7 {

	WebDriver driver;

	Calender_7(WebDriver driver) {
		this.driver = driver;
	}

	public void run() {

		driver.get("https://www.gozayaan.com/");

		int len = driver.findElements(By.xpath("//span[@class='radio-btn']")).size();

		for (int i = 0; i < len; i++) {

			if (i == 0) {

				driver.findElements(By.xpath("//span[@class='radio-btn']")).get(i).click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
		}
		driver.findElement(By.cssSelector("div[class = 'box location from']")).click();
		// div[@class='input-wrapper'] //input[@type='text']

		driver.findElement(By.xpath("//div[@class='input-wrapper'] //input[@type='text']")).sendKeys("DHA");
		driver.findElement(By.xpath("//div[@class='input-wrapper'] //input[@type='text']")).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// (//div[@class='airport'])[2]
		driver.findElement(By.xpath("//div[@class='airport-list']/div[2]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//div[@class='input-wrapper'] //input[@type='text']")).sendKeys("COX");
		driver.findElement(By.xpath("//div[@class='input-wrapper'] //input[@type='text']")).sendKeys(Keys.ENTER);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='airport-list']/div[2]")).click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.cssSelector(".day5.selected")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.cssSelector("div[class='box date return']")).isEnabled());
		driver.quit();
	}

}
