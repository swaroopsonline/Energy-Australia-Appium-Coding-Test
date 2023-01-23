package screens;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class RegistrationPageScreen {

	public AppiumDriver driver;
	
	public RegistrationPageScreen(AppiumDriver driver) {
		
		this.driver = driver;
		
	}

	public void enterAccountNo() {

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[1]"))
				.sendKeys("1234567890");

	}

	public void enterPostCode() {

		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.EditText[2]"))
				.sendKeys("1234");

	}

	public void clickOnNextButton() {

		driver.findElement(AppiumBy.accessibilityId("Next")).click();

	}

	public void clickOnIncorrectDetailsPopUp() {
		driver.findElement(By.id("android:id/button1")).click();

	}

	public void clickOnCancelButton() {

		driver.findElement(AppiumBy.accessibilityId("Cancel")).click();

	}

}
