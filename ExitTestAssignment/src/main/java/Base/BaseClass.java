package Base;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass
   {
		//initialize drivers
		public AppiumDriver<MobileElement> wd = null;
		protected AppiumDriverLocalService service;
		
		//start appium server
		@BeforeSuite
		public void start() {
			service = AppiumDriverLocalService.buildDefaultService();
			service.start();
			Logger1.info("Appium Server Started");
		}
		@BeforeTest
		//Desire capabilities for app
		public void setup() {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformVersion", "8.0");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "Android");
			capabilities.setCapability("appPackage", "com.hmh.api");
			capabilities.setCapability("appActivity", ".ApiDemos");
			capabilities.setCapability("app", "C:\\Users\\aryankesharwani\\Desktop\\ApiApk\\API Demos_4.0_apkcombo.com.apk");
			//capabilities.setCapability("isHeadless", false);
			//server path
			try {
				wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		

		@AfterTest
		  public void stopAppium() throws InterruptedException 
		  { 
			  Thread.sleep(3000);
			  wd.quit();
			  Logger1.info("Test Case Successfully Completed");
		  }
		  
	}
