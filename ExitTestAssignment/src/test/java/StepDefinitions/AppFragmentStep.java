package StepDefinitions;

import org.testng.annotations.Test;

import Base.BaseClass;
import Base.Logger1;
import Screens.AppFragment;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AppFragmentStep extends BaseClass {
	@Test(priority=1)
	@Given("^User click to the App$")
	public void user_click_to_the_App() throws Throwable {
		this.wd.findElement(AppFragment.App_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the App button");
	    
	}
  @Test(priority=2)
	@Then("^Click to the Fragment button$")
	public void click_to_the_Fragment_button() throws Throwable {
		this.wd.findElement(AppFragment.Fragment_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Fragment button");
	    
	}
@Test(priority=3)
	@Then("^Click to the Recieve Result$")
	public void click_to_the_Recieve_Result() throws Throwable {
		this.wd.findElement(AppFragment.RecieveResult_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Receive Result button");
	    
	}
@Test(priority=4)
	@Then("^Click to the Get Result$")
	public void click_to_the_Get_Result() throws Throwable {
		this.wd.findElement(AppFragment.GetResult_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Get Result button");
			    
	}
@Test(priority=5)
	@Then("^Select the Color$")
	public void select_the_Color() throws Throwable {
		this.wd.findElement(AppFragment.Color_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Color button");
	    
	}
@Test(priority=6)
	@Then("^Again Click to the Recieve Result$")
	public void again_Click_to_the_Recieve_Result() throws Throwable {
		this.wd.findElement(AppFragment.GetResult_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Receive button");
	    
	}
@Test(priority=7)
	@Then("^Select the color$")
	public void select_the_color() throws Throwable {
		this.wd.findElement(AppFragment.Color1_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the color button");
	    
	}

}
