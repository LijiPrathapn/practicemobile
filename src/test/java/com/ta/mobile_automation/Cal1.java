package com.ta.mobile_automation;

	import java.net.MalformedURLException;
	import java.net.URL;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;


public class Cal1 {
		public static void main(String[] args) throws Exception {
			
			AppiumDriver<WebElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243"); // 
			
		
			cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
			cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
			
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
			
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/calc_keypad_btn_02']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='+' and @index='15']")).click();
			driver.findElement(By.xpath("//android.widget.Button[(@text='6')]")).click();
			driver.findElement(By.xpath("//android.widget.Button[contains(@text,'=')]")).click();
		

	}

}
/*by.className
By.xpath only class name  //android.widget.Button
 By.id("com.android.calculator2:id/digit_1")
 By.id("digit_1")
 By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']")
 content-desc
 By.xpath("//android.widget.Button[@text='1']
 By.xpath("//android.widget.Button[contains(@text,"5")]")
  By.xpath("//android.widget.Button[@text='5' and @index='4']") */
