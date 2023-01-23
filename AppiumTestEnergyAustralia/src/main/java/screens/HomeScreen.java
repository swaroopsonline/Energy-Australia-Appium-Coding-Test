package screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class HomeScreen {
	
	public AppiumDriver driver;
	
	public HomeScreen(AppiumDriver driver) {
			
		this.driver = driver;
		
	}
	
	public void clickOnRegistrationButton() {
		
		driver.findElement(AppiumBy.accessibilityId("Register")).click();
		
	}

}
