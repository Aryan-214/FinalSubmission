package Screens;

import org.openqa.selenium.By;

import Base.BaseClass;
import io.appium.java_client.MobileBy;

public class Animation extends BaseClass {
	public static By Bouncing_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By Animation_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By Screen_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.view.View");
	public static By Cloning_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By RunButton_Tap = MobileBy.id("com.hmh.api:id/startButton");
}
