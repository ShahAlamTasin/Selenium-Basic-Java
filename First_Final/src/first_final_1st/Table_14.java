package first_final_1st;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table_14 {
	WebDriver driver;
	
	public Table_14(WebDriver driver) {
		this.driver =  driver;
	}
	
	public void run() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5L));
//		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/56969/ban-vs-ind-1st-test-india-tour-of-bangladesh-2022");
//		//innings_1 + 'cb-col cb-col-100 cb-ltst-wgt-hdr' --- indian batsmans 1st innings
//		//cb-col cb-col-8 text-right text-bold --- batsman run
//		//cb-col cb-col-8 text-bold cb-text-black text-right --- extra
//		//cb-col cb-col-8 text-bold text-black text-right -- total
//		
//		int sizeoflist = driver.findElements(By.xpath("(//div[@id='innings_1'] //div[contains(@class,'cb-col cb-col-100 cb-ltst-wgt-hdr')])[1] //div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-right text-bold']")).size();
//		int sum = 0;
//		for (int i=0;i<sizeoflist;i++) {
//			String run=driver.findElements(By.xpath("(//div[@id='innings_1'] //div[contains(@class,'cb-col cb-col-100 cb-ltst-wgt-hdr')])[1] //div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText();
//			
//			sum+= Integer.parseInt(run);
//		}
//		
//		String extraRun= driver.findElement(By.xpath("(//div[@id='innings_1'] //div[contains(@class,'cb-col cb-col-100 cb-ltst-wgt-hdr')])[1] //div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-bold cb-text-black text-right']")).getText();
//		
//		int extra  =  Integer.parseInt(extraRun);
//		sum+= extra;
//		System.out.println(sum);
//		String total = driver.findElement(By.xpath("(//div[@id='innings_1'] //div[contains(@class,'cb-col cb-col-100 cb-ltst-wgt-hdr')])[1] //div[@class='cb-col cb-col-100 cb-scrd-itms'] //div[@class='cb-col cb-col-8 text-bold text-black text-right']")).getText();
//		
//		System.out.println(total.equalsIgnoreCase(sum+""));
		
		// --------------------- Another way of same task that shown in previous -------------------------
		// -------------------- Previous way too much depend on class names ------------------------------
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/56969/ban-vs-ind-1st-test-india-tour-of-bangladesh-2022");
		WebElement table = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		// childtag:nth-child(n) xpath e kaj kore na
		int totalrow = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		int sumofrun = 0;
		
		
		for(int i =0; i<totalrow-2;i++) {
			String run = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			sumofrun+= Integer.parseInt(run);
		}
		int extrarun = Integer.parseInt(table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		
		sumofrun+=extrarun;
		String totalrun = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		System.out.println(totalrun.equalsIgnoreCase(sumofrun+""));
		driver.quit();
	}

}
