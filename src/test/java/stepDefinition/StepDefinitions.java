package stepDefinition;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePageObject;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import helper.Helper;

public class StepDefinitions {
	public AndroidDriver<?> driver;
	public HomePageObject homePageObject;
	public Helper helper;
	
	float value;
	Float totalTipAmount;
	
	@SuppressWarnings("rawtypes")
	public void InitDriver() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Pixel 3 XL API 28");
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "org.traeg.fastip");
		caps.setCapability("appActivity", "org.traeg.fastip.MainActivity");
		caps.setCapability("noReset", "false");
		
		helper = new Helper();
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		homePageObject = new HomePageObject(driver);
	}
	
	@Given("^Init Fastip App$")
	public void init_fastip_app() throws MalformedURLException {
		InitDriver();
//	    homePageObject.clickSettingButton();
	}
	
	@When("Enter Bill Amount \"([^\"]*)\"$")
	public void enter_bill_amount(String args1) {
		value = Float.parseFloat(args1);
		homePageObject.setBillAmount(args1);
	}
	
	@When("^Click in button Calculate Tip$")
	public void click_in_button_calculate_tip() {
		homePageObject.clickCalculateTip();
	}
	
	@Then("^Validate Tip Amount$")
	public void validate_tip_amount() {
		Float tipAmount = helper.convertamount(homePageObject.getTipAmount());
		Float percentage = helper.convertPercentage(homePageObject.getPercentage());
		totalTipAmount = percentage * value;
		Assert.assertEquals(totalTipAmount, tipAmount);
	}
	
	@Then("^Validate Total Amount$")
	public void validate_total_amount() {
		Float totalAmount = helper.convertamount(homePageObject.getTotalAmount());
		Float total = value + totalTipAmount;
		Assert.assertEquals(total, totalAmount);
	}
	
}
