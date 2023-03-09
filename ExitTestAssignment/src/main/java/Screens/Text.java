package Screens;

import org.openqa.selenium.By;

import Base.BaseClass;
import io.appium.java_client.MobileBy;

public class Text extends BaseClass{
	public static By Text_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[10]\r\n");
    public static By Linkify_tab = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]");
    public static By LogTextBox = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]\r\n");
    public static By Add_tab = MobileBy.id("com.hmh.api:id/add");
}
