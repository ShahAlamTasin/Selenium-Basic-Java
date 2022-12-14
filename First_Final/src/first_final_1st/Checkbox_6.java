package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Checkbox_6 {
	WebDriver driver;
	
 public	Checkbox_6( WebDriver driver){
		this.driver =  driver;
	}
 
 public void run() {
	 
	 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	 
	/*
	 *  TestNg  provide assertion function 
	 *  assertion have some multiple function .
	 *  if conditions meets test will pass otherwise test fail
	 */
	// assertfalse expected the parameter return false..... false will pass the test 
	Assert.assertFalse(driver.findElement(By.cssSelector("input[class*='-bMcfAe']")).isSelected()); 
	 driver.findElement(By.cssSelector("input[class*='-bMcfAe']")).click();
	 // assertTrue expected the parameter return true ...... true will pass the test
	 Assert.assertTrue(driver.findElement(By.cssSelector("input[class*='-bMcfAe']")).isSelected());
	 
	 
	 // based on common locator for all the checkbox it is returning size
	 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	 
	 // assertEquals will compare parameter right and left , the test will pass if both are same 
	 Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 1);
	 driver.quit();
 }
	

}
