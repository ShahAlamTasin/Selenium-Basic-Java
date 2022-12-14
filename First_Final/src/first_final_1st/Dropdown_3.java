package first_final_1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

// *********************** dropdown *********************

public class Dropdown_3 {

	/*
	 * --------------- static dropdown------------------- 
	 * static dropdown contains hard coded options / values use selct class in selenium - for this the item
	 must have select html tag 
	 * static dropdown have select tag and options has option tag 
	 * create select class object with dropdown locator then select it via value -giving in option , index - 0 based , visible text (UI visible
	  texxt) can deselect item also
	 */

	WebDriver driver;

	public Dropdown_3(WebDriver driver) {

		this.driver = driver;
	}

	public void run() {

		
		  //------------- static drop down
		  driver.get("https://www.flynovoair.com/");
		  
		 try { Thread.sleep(5000); } 
		 catch (InterruptedException e) 
		 { // TODO Auto-generated catch block 
		 e.printStackTrace(); }
		 
		  Select stat_drop = new Select(driver.findElement(By.xpath("//div[@id = 'flight_types1']/following-sibling::div[2]/div[1]/div/div[2]/div/div/select")));
		 
		  stat_drop.selectByValue("4"); 
		  try { Thread.sleep(1000); }
		   catch(InterruptedException e)
		  { // TODO Auto-generated catch block
		   e.printStackTrace(); }
		  
		  stat_drop.selectByIndex(0);
		  
		  try { Thread.sleep(1000); } 
		  catch (InterruptedException e) 
		  { // TODO Auto-generated catch block 
			  e.printStackTrace(); 
		  }
		  
		 stat_drop.selectByVisibleText("6"); 
		 //div[data-testid='home-page-travellers']
		 
		  driver.get("https://www.gozayaan.com/?utm_term=gozayaan&utm_campaign=Search_Flight%20Keywords_Generic&utm_source=adwords&utm_medium=ppc&hsa_acc=8659916254&hsa_cam=17079331394&hsa_grp=137289311458&hsa_ad=595221497504&hsa_src=g&hsa_tgt=aud-1414438359346%3Akwd-376105068202&hsa_kw=gozayaan&hsa_mt=b&hsa_net=adwords&hsa_ver=3&gclid=CjwKCAiA7IGcBhA8EiwAFfUDsej_c8qktRjv_tQptgapW_9aBH9oi52jWbhKGG78sJ1q51P-Bpv_FxoC0ekQAvD_BwE");
		 
		  try { Thread.sleep(1000); } 
		 catch (InterruptedException e) { // TODO Auto-generated catch block
			 
		 
		 e.printStackTrace(); }
		 
		 driver.findElement(By.cssSelector("div[class='box traveler']")).click();
		 
		 for(int i = 0; i <6;i++) {
		 
		 if(i<4) {
		  driver.findElement(By.xpath("//div[@class='adults']/div[2]/button[2]")).click(); } 
		 else {
		 driver.findElement(By.xpath("//div[@class='children']/div[2]/button[2]")).click(); }
		 
		 } 
		 //div[@class='box traveler active']/div[1]
		  
		  System.out.println(driver.findElement(By.xpath("//div[@class='box traveler active']/div[1]")).getText());
		 

		/*
		 * ---------------- dynamic dropdown --------------------------- 
		 * it is a kind of dropdown when one dropdown action based on another dropdown after select options from one dropdown the other dropdown available for option select it
		 can be handle by 2 ways 
		 * first one is by xpath .. in this scenario if the two dropdown list items have same attributes when we try to access the second
		  dropdown after the first one due to have same attributes selemium will return 2 results .. thats why for selecting list item from the second dropdown
		 * syntax will be (xpath)[n] select nth result among the xpath returns
		  driver.get("https://usbair.com/#");
		  */
		  
		  //div[@data-column='1']/ul/li[3] ----- select third list item from first dropdown 
		   
		 // (//div[@data-column='1']/ul/li[1])[2]
		 
		  driver.findElement(By.id("select2-departure1-container")).click();
		  
		 driver.findElement(By.xpath("//div[@data-column='1']/ul/li[3]")).click();
		 
		 try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated catch block
		   e.printStackTrace();
		  
		  }
		  
		  driver.findElement(By.xpath("(//div[@data-column='1']/ul/li[1])[2]")).click() ;
		 
		 try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		  
		 /* ----------- UPORER example kaj kore na website dynamic dropdown e na
		 * --------- 2 **************** //parentxpath //childxpath (another way to
		 * handle dynamic dropdown it will search the child in parent) - parent child
		 * relationship
		 * 
		 * //------------ here between parent and child xpath 1 space must
		 * ------------------(dont mix it with parent child traverse)
		 */
		// TODO HAVE to find a dynamic dropdown website and write example code...

		driver.quit();

	}

}
