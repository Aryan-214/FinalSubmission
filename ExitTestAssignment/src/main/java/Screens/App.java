package Screens;

import org.openqa.selenium.By;

import Base.BaseClass;
import io.appium.java_client.MobileBy;

public class App extends BaseClass{
	public static By App_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
	public static By ActionBar_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]");
	public static By ActionBarTabs_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]");
	public static By Toggle_Tap = MobileBy.id("com.hmh.api:id/btn_toggle_tabs");
	public static By AddTab_Tap = MobileBy.id("com.hmh.api:id/btn_add_tab");
	public static By RemoveTab_Tap = MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]");
	public static By RemoveAllTab_Tap = MobileBy.id("com.hmh.api:id/btn_remove_all_tabs");
}
