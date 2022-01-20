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


	public class Clock {
		public static void main(String[] args) throws Exception {
			
			AppiumDriver<WebElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243"); // 
			
		
			cap.setCapability("appPackage", "com.sec.android.app.clockpackage");
			cap.setCapability("appActivity", "com.sec.android.app.clockpackage.ClockPackage");
			
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add alarm']")).click();
			System.out.println("click alram");
			/*driver.findElement(By.xpath("//android.widget.TextView[(@text,'8.00')]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[(@text,'S M T W T F S')]")).click();*/
			
			
			/*android.widget.TextView
			text
			S M T W T F S*/

			
			
	}

}
