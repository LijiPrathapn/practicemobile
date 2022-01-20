package com.ta.mobile_automation;

		import java.net.URL;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.WebDriverException;

		import io.appium.java_client.AppiumDriver;
		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.remote.MobileCapabilityType;
		public class Kohls_app {

					public static void main(String[] args) throws Exception {
						
						AppiumDriver<WebElement> driver;
						
						DesiredCapabilities cap = new DesiredCapabilities();
						cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
				        cap.setCapability(MobileCapabilityType.DEVICE_NAME, ""); // 
						
					
						cap.setCapability("appPackage", "com.kohls.mcommerce.opal");
						cap.setCapability("appActivity", "com.kohls.mcommerce.opal.framework.view.activity.KohlsSplashScreen");
			
						
						driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
						
						driver.findElement(By.xpath("//android.widget.Button[(@text='Deny')]")).click();
						System.out.println("done");
						//driver.findElement(By.xpath("//android.widget.Button[(@text='Agree')]")).click();

	}

}
