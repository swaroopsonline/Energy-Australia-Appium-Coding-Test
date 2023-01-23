package steps;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import base.BaseSteps;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.HomeScreen;
import screens.RegistrationPageScreen;

public class EASteps extends BaseSteps{
	
	//public static AndroidDriver driver ;
	HomeScreen hs = new HomeScreen(driver);
	RegistrationPageScreen reg = new RegistrationPageScreen(driver);
	

	@Given("I click on the Register Button")
	public void i_click_on_the_register_button() {

		
		hs.clickOnRegistrationButton();
	}

	@When("I enter the account no")
	public void i_enter_the_account_no() {
		
		reg.enterAccountNo();
		
	}

	@And("I enter the postcode")
	public void i_enter_the_postcode() {
		
		reg.enterPostCode();

	}

	@And("I click on the Next Button")
	public void i_click_on_the_next_button() {
		
		reg.clickOnNextButton();

	}

	@Then("I click on Ok on the Incorrect details pop-up")
	public void i_click_on_ok_on_the_incorrect_details_pop_up() {
		
		reg.clickOnIncorrectDetailsPopUp();
	}

	@And("I click on Cancel button")
	public void i_click_on_cancel_button() {
		
		reg.clickOnCancelButton();

	}
	


}
