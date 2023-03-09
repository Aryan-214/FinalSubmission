package StepDefinitions;

import org.testng.annotations.Test;
import Base.BaseClass;
import Base.Logger1;
import Screens.App;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AppStep extends BaseClass{
	@Test(priority=1)
	@Given("^User click to the App$")
	public void user_click_to_the_App() throws Throwable {
	    this.wd.findElement(App.App_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the App button");
	}
	@Test(priority=2)
	@Then("^click to the Action Bar$")
	public void click_to_the_Action_Bar() throws Throwable {
		this.wd.findElement(App.ActionBar_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Action Bar button");
	}
	@Test(priority=3)
	@Then("^click to the Action Bar Tabs$")
	public void click_to_the_Action_Bar_Tabs() throws Throwable {
	    this.wd.findElement(App.ActionBarTabs_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Action Bar Tabs");
	}
	@Test(priority=4)
	@Then("^click to the Toggle Tab Mode$")
	public void click_to_the_Toggle_Tab_Mode() throws Throwable {
		this.wd.findElement(App.Toggle_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Toggle Tab Mode");
	}
	@Test(priority=5)
	@Then("^click to the Add New Tab$")
	public void click_to_the_Add_New_Tab() throws Throwable {
		this.wd.findElement(App.AddTab_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Add New Tab");
	}
	
	@Test(priority=6)
	@Then("^click to the Remove Last Tab$")
	public void click_to_the_Remove_Last_Tab() throws Throwable {
		this.wd.findElement(App.RemoveTab_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Remove Last Tab");
	}
	@Test(priority=7)
	@Then("^click to the Remove All Tab$")
	public void click_to_the_Remove_All_Tab() throws Throwable {
		this.wd.findElement(App.RemoveAllTab_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Remove All Tabs");
	}

}
