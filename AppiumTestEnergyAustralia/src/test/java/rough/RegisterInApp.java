package rough;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class RegisterInApp {

	//public static AndroidDriver driver;
	public static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "au.com.energyaustralia.nsmobile");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.tns.NativeScriptActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		/* Click on Register Button */
		driver.findElement(AppiumBy.accessibilityId("Register")).click();

		/* Enter invalid Account no */
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]"))
				.sendKeys("1234567890");
		/* Enter invalid Postcode */
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]"))
				.sendKeys("1234");

		/* Click on Next Button */
		driver.findElement(AppiumBy.accessibilityId("Next")).click();

		/* Click on the Incorrect details pop-up */
		driver.findElement(By.id("android:id/button1")).click();

		/* Click on the Cancel Button */
		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();

		driver.quit();

	}

}
