package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import utilities.CommonUtils;

public class BaseSteps {
	
	public static AppiumDriver driver;
	public static String loadPropertyFile = "Android_EA.properties";
	
	public byte[] getScreenshot() {
		
		return driver.getScreenshotAs(OutputType.BYTES);
	}
	
	
	public void setUp() {
		
		
		if(loadPropertyFile.startsWith("Android_")) {
			
			
			CommonUtils.loadAndroidConfProp(loadPropertyFile);
			CommonUtils.setAndroidCapabilities();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver = CommonUtils.getAndroidDriver();
			
			
		}else if(loadPropertyFile.startsWith("IOS")) {
			
			
		}
		
	}
	
	public void quit() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
