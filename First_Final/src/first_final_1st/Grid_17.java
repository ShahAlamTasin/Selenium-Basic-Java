package first_final_1st;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid_17 {
	

	public static void main(String[] args) throws MalformedURLException {
		/*
		 * at first  download selenium grid jar in both 2 devices 
		 * ensure 2 devices are connected to same network by tracer command in cmd
		 *********** in the hub device  do this step******************
		  1. go to the folder where the selenium grid jar was kept
		  2. open cmd there
		  3.give following command
		   ( java -jar <jarfilename>.jar hub 
		  4.this will give you a port number where the node will communicate with the hubs ip address
		    (this will be in  this format http://<ip_adress>:portnumber)
		  5. note down the ip adress and port number
		   //--------------------------------------------------
		 ********* in the node device do the following steps***************
		 6. download jdk and set path variable of java as set during java setup
		 7. download the jar file for different browser. 
		 8. repeat step 1 and 2 again
		 9.give the follwing command
		     (java -DwebDriver.edge.driver"EDGE browser webdriver exe file path" -jar <jarfilename>.jar node --hub http://<hubs ip_adress>:hubs portnumber)
		     for chrome -DwebDriver.chrome.driver"chrome browser webdriver exe file path" 
		 10 . -------------------- ensure the version compatibility between browser and Webdriver ------------------
		 11. in hub visit http://<ip_adress>:portnumber which you got from step 4 and see if the node is actually connected or not
		 */
		
		// after completing these steps write following code to your hub
		
		 DesiredCapabilities dc =  new DesiredCapabilities();
		 dc.setBrowserName("MicrosoftEdge"); // set the required browser for the node(selected browser must be installed in node)
		 dc.setPlatform(Platform.WINDOWS); // set which platform the node has
		 
		 WebDriver driver =  new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		 driver.get("https://www.google.com/");
	}
}
