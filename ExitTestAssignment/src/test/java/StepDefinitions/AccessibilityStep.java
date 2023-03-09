package StepDefinitions;
import org.testng.annotations.Test;

import Base.BaseClass;
import Base.Logger1;
import Screens.Accessibility;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class AccessibilityStep extends BaseClass {

	@Test(priority=1)
	@Given("^User click to the Accessibility$")
	public void user_click_to_the_Accessibility() throws Throwable {
		this.wd.findElement(Accessibility.Accessibility_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Accessibility");
	}
	@Test(priority=2)
	@Then("^Click to Accessibility Node Querying$")
	public void click_to_Accessibility_Node_Querying() throws Throwable {
		this.wd.findElement(Accessibility.AccessibilityNQ_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the Accessibility Node Querying");
	}
	@Test(priority=3)
	@And("^Click to the check box$")
	public void click_to_the_check_box() throws Throwable {
		this.wd.findElement(Accessibility.AccessibilityClick_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the check box");
	}
	@Test(priority=4)
	@And("^Click to the check bok$")
	public void click_to_the_check_bok() throws Throwable {
		this.wd.findElement(Accessibility.AccessibilityClick1_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the check box");
	    
	}
	@Test(priority=5)
	@And("^Again Click to the check box$")
	public void again_Click_to_the_check_box() throws Throwable {
		this.wd.findElement(Accessibility.AccessibilityClick2_Tap).click();
	    Thread.sleep(3000);
	    Logger1.info("user has successefully clicked to the check box");
	    
	}
	


}
