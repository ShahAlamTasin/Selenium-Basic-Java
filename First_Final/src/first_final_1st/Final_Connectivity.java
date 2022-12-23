package first_final_1st;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Final_Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shaha\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
//		WebDriver driver =  new FirefoxDriver();
//		driver.get("http://google.com");
//		System.out.println(driver.getTitle()); 

//-------------chromedriver used for chrome---------------------

		System.setProperty("webdriver.edge.driver", "C:\\Users\\shaha\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

//		Driver_Methods_1 driver_method =  new Driver_Methods_1(driver);
//		driver_method.run();

//		Locators_2 locators = new Locators_2(driver);
//		locators.run();

		
//		Locators_2_1 locators_1 = new Locators_2_1(driver);
//		locators_1.run();

//		Locators_2_2 locators_2 = new Locators_2_2(driver);
//		locators_2.run();

//		Locators_2_3 locators_3 = new Locators_2_3(driver);
//		locators_3.run();

//		Dropdown_3 dropdown_1 =  new Dropdown_3(driver);
//		
//		dropdown_1.run();

//		Dropdown_3_1 dropdown_2 =  new Dropdown_3_1(driver);
//		dropdown_2.run();

//		Dropdown_3_2 dropdown_3 =  new Dropdown_3_2(driver);
//		dropdown_3.run();
		
//		RadioButton_4 radiobutton_1 = new RadioButton_4(driver);
//		radiobutton_1.run();

//		Alerts_5 alert_1 =  new Alerts_5(driver);
//		alert_1.run();

//		Checkbox_6 checkbox_1 =  new Checkbox_6(driver);
//		checkbox_1.run();

//		Calender_7 calender_1 = new Calender_7(driver);
//		calender_1.run();
//		
//		Wait_8 wait_1 = new Wait_8(driver);
//		wait_1.run();
		
//		Action_9 action_1 =  new Action_9(driver);
//		action_1.run();
		
//		Window_shift_10 winshift =  new Window_shift_10(driver);
//		winshift.run();
		
//		Drag_And_Drop_11 dragdrop =  new Drag_And_Drop_11(driver);
//		dragdrop.run();
		
//		WebDriver_Scope_12 driver_scope =  new WebDriver_Scope_12(driver);
//		driver_scope.run();
	
//		Calender_Advance_13 caladvance =  new Calender_Advance_13(driver);
//		caladvance.run();
		
//		Table_14 table_1 =  new Table_14(driver);
//		table_1.run();
		
		Extra_Func_16 extra_1 =  new Extra_Func_16(driver);
		try {
			extra_1.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
