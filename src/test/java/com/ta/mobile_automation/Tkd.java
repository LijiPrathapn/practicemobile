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

	public class Tkd {


		public static void main(String[] args) throws Exception {
			
			AppiumDriver<WebElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243"); // 
			
		
			cap.setCapability("appPackage", "com.google.android.apps.maps");
			cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
			
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			//iver.findElement(By.xpath("//android.widget.TextView[@text='Search here' and @index='0]")).click();
}}
