package pageObject;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class HomePageObject{
  private AndroidDriver<?> driver;
  
  public HomePageObject(AndroidDriver<?> driver){
	  this.driver = driver;
  }
  
  public void setBillAmount(String value) {
	  this.driver.findElement(By.id("org.traeg.fastip:id/billAmtEditText")).sendKeys(value);
  }
  
  public void clickCalculateTip() {
	  this.driver.findElement(By.id("org.traeg.fastip:id/calcTipButton")).click();
  }
  
  public void clickSettingButton() {
	  this.driver.findElement(By.id("org.traeg.fastip:id/menu_settings")).click();
  }
  
  public String getPercentage() {
	  return this.driver.findElement(By.id("org.traeg.fastip:id/tipPctTextView")).getText(); 
  }
  
  public String getTipAmount() {
	  return this.driver.findElement(By.id("org.traeg.fastip:id/tipAmtTextView")).getText();
  }
  
  public String getTotalAmount() {
	  return this.driver.findElement(By.id("org.traeg.fastip:id/totalAmtTextView")).getText();
  }
}
