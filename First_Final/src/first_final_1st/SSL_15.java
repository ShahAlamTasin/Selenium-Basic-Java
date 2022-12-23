package first_final_1st;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class SSL_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a separate class from  rest of the class
		// here shown how to  accept ssl certification and go to desired location
		//we have to modify our current brower profile by adding capabilities
	
		
	
		// chrome have chromeOptions firefox has firefox options 
		EdgeOptions ed =  new EdgeOptions();
        ed.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        ed.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        
        // use desiredCapability then merge with options is depricated
        
    	System.setProperty("webdriver.edge.driver", "C:\\Users\\shaha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
    	// pass the options object to  here
		WebDriver driver = new EdgeDriver(ed);
		
	}

}
