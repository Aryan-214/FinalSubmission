package Screens;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;

public class AppFragment {
	public static By App_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
	public static By Fragment_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]");
	public static By RecieveResult_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[11]");
	public static By GetResult_Tap = MobileBy.id("com.hmh.api:id/get");
	public static By Color_Tap = MobileBy.id("com.hmh.api:id/corky");
	public static By Color1_Tap = MobileBy.id("com.hmh.api:id/violet");
	
}
