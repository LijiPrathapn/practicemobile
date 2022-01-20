package com.ta.mobile_automation;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
		public class Ebay {

			public static void main(String[] args) throws Exception {
				
				AppiumDriver<WebElement> driver;
				
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
		        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243"); // 
				
			
				cap.setCapability("appPackage", "com.ebay.mobile");
				cap.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
				
				driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
				driver.findElement(By.id("button_sign_in")).click();

	}
/*android.widget.RelativeLayout
 
driver.findElement(By.xpath("//android.widget.Button[@text='+' and @index='15']")).click();
 */
}
