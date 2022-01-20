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

	public class Camera {


		public static void main(String[] args) throws Exception {
			
			AppiumDriver<WebElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243"); // 
			
		
			cap.setCapability("appPackage", "com.sec.android.app.camera");
			cap.setCapability("appActivity", "com.sec.android.app.camera.Camera");
			
			driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
			
			driver.findElement(By.id("button1")).click();
			System.out.println("Done");
			
			driver.findElement(By.xpath("//GLButton[@text='Shutter' and @index='']")).click();
			System.out.println("Completed");
			//driver.findElement(By.xpath("//android.view.View[@text='2020-8-8' and @index='13']")).click();

} }
