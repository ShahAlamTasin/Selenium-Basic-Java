package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

// this  class contains xpath and css among locators 
//xpath is a way of find the element when selenium read the pages elements

//  xpath / css selectors can be generated in n number of ways 

// during paste the browser generated xpath replace the double quotes (") to single (') 


// for xpath,  select then inspect the specific element the right click on it then select copy xpath from the options

// ******* if xpath starts with html tag its not reliable dont use it ***********

/* for css selector , select then inspect the specific element the right click on it then select css selector from the options
 * in chorome browser you have to check the  row before  console in inspect elements window  and find the right css selector by check each
  
 *  **** carefull choose css selector dont choose css path ****



 */
public class Locators_2_1 {

	WebDriver driver;
	public Locators_2_1(WebDriver driver) {
	this.driver = driver;
	}
	public void run() {
		
	driver.get("https://login.salesforce.com/?locale=in");
		
	//................. use xpath...........................................	
		//*[@id="username"] -> //*[@id='username']
		
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("this field set via xpath");
		
		//*[@id="password"] -> *[@id='password']
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345");
		
		//*[@id="Login"] -> //*[@id='Login']
		
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		// print the error message for invalid login in console by xpath
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
	
		
		
	// ........................use css selector...............
	 
		driver.get("https://login.salesforce.com/?locale=in");
		// #username
		
	driver.findElement(By.cssSelector("#username")).sendKeys("this field set via css selector");
		
		//  #password
		
		driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		
		//#Login
		driver.findElement(By.cssSelector("#Login")).click();
		
		//*[@id="error"] -> //*[@id='error']
		
		
		
		
	
		
		/* .................validate...........................
		 validate xpath and css in browser console 
		  $x("")       ...... for xpath  $x("//*[@id='username']")
		  $("")    ......... for css selector $("#username")
		  if found it will point the element if not then null or error return
		 */
		
		/* ...................customized xpath ...................................... 
		 * 
		 * you can generate your own xpath by following this format
		     ************ //tagname[@attribute='value'] ************
		  
		  if an element has this following inner html 
		  
		  <input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" 
		  id="username" aria-describedby="error" style="display: block;">
		  
		  xpath can be //input[@id='username'] or //input[@type='email'] or //input[@name='username']
		  
		  ******* during choosing attribute you must focus that it must be unique one*******
		   
		 in xpath  tagname can be ignored //*[@attribute='value']
		 then it will apply the action to all element with given attribute
		 
		 //*[@id='username']
		  
	 */
	
		
		// ........... give username & pass and press login via custom xpath ........... 
		 
		
		driver.get("https://www.facebook.com/");
		//input[@data-testid='royal_email']
		driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("given by custom xpath");
		//input[@class='inputtext _55r1 _6luy _9npi']
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']")).sendKeys("false");
		
		//*[@data-testid='royal_login_button']
		
		driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
		
		//div[@class='_9ay7']
		System.out.println(driver.findElement(By.xpath("//div[@class='_9ay7']")).getText());
  	
		
		/*
		 *  ........... For generate custom CSS  the formula is ..............
		      ******* tagname[attribute='value'] ***********
		      *  if an element has this following inner html 
		  
		  <input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" 
		  id="username" aria-describedby="error" style="display: block;">
		  
		  custom css selector is  input[type='email'] or input[class='input r4 wide mb16 mt8 username'] 
		    tag name can be ignored [type='email']
		  
		  ******** if id is given tagename#id can also be css selector *********
		  
		 */
		
		driver.get("https://www.facebook.com/");
	  //	input[data-testid='royal_email']
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("given by custom xpath");
		//         input[class='inputtext _55r1 _6luy _9npi']
		driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']")).sendKeys("false");
		
		//        [data-testid='royal_login_button']
		
		driver.findElement(By.cssSelector("[data-testid='royal_login_button']")).click();
		
		//     [class='_9ay7']
				System.out.println(driver.findElement(By.cssSelector("[class='_9ay7']")).getText());
		
	driver.quit();
		
		
	
		
	}
}
