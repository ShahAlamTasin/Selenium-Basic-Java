package first_final_1st;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Extra_Func_16 {

	WebDriver driver;
	public Extra_Func_16(WebDriver driver) {
		this.driver = driver;
	}
	
	public void run() throws IOException {
		
		// this will maximize the window size;
		driver.manage().window().maximize(); 
		
		driver.get("https://www.google.com/");
		/* ------- cookies ---------------------
		 // this will delete all coookies from browser at once
		driver.manage().deleteAllCookies();
		// this will delete a specific cookie by its name
		driver.manage().deleteCookieNamed("aammaa");
		 // you can create a cookie then add through it 
		driver.manage().addCookie(null);
		*/
		
		// ----------- take screenshot ----------------
		
		/* steps
		 *  cast the driver to takescreenshot then use getscreenshot method
		 *  save the output type as file
		 *  import fileutils that will allow  you copy and save the screenshot in your device
		 *  in the avoid giving ppath of c drive. if you give it will through error
		 *  cause 3rd party will need permissions to write any file on c drive . code will be complex
		 *  if you have one drive only then use the user folder in the drive.
		 *  if  you cant import FileUtils directly from java , go to "https://commons.apache.org/proper/commons-io/download_io.cgi"
		    then download the jar file under binaries section and import the jars into your projects.
		 */
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(src,new File("C:\\Users\\shaha\\screenshot.png"));
	}
}
