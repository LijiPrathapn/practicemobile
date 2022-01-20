package com.ta.mobile_automation;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.sun.org.apache.xml.internal.serializer.ToUnknownStream;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Mobile_Homework {


public static void main(String[] args) throws InterruptedException, IOException, WebDriverException {
			
			AndroidDriver<AndroidElement> driver;
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID"); //"platformName", "ANDROID"
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "9887f7443035425243");
	        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	        cap.setCapability(MobileCapabilityType.UDID,"9887f7443035425243");
	       cap.setCapability(MobileCapabilityType.NO_RESET,true); 
			
		
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.samsung.android.contacts");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.samsung.android.contacts.contactslist.PeopleActivity");
			
		
   driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
       
        MobileElement scrollview = driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
        + ".resourceId(\"com.samsung.android.contacts:id/contact_list_item_main\"))"
        + ".scrollIntoView(new UiSelector().text(\"Ashok\"))");
        scrollview.click();
        
    
       
		}

			
		}
		

