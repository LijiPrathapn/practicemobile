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

		public class Amazon_Test {

			public static void main(String[] args) throws Exception {
				
				AppiumDriver<WebElement> driver;
				
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
		        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243"); // 
				
			
				cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
				cap.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
				
				driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
				
				driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout")).click();
				/*/driver.findElement(By.id("calc_keypad_btn_03")).click();
				driver.findElement(By.id("calc_keypad_btn_equal")).click(); */
			

	}

}
