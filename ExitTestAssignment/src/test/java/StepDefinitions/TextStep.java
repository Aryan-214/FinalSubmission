package StepDefinitions;

import org.testng.annotations.Test;

import Base.BaseClass;
import Base.Logger1;
import Screens.Text;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Test
public class TextStep extends BaseClass {
	@Test(priority = 1)
	@Given("^User click to the Text$")
	public void user_click_to_the_Text() throws Throwable {
		this.wd.findElement(Text.Text_Tap).click();
		Thread.sleep(2000);
		Logger1.info("user has successefully clicked to the Text Button");
	}

	@Test(priority = 2)
	@When("^Click to linkify$")
	public void click_to_linkify() throws Throwable {
		this.wd.findElement(Text.Text_Tap).click();
		Thread.sleep(2000);
		Logger1.info("user has successefully clicked to the check box");

	}

	@Test(priority = 3)
	@When("^Click to logTextBox$")
	public void click_to_logTextBox() throws Throwable {
		this.wd.findElement(Text.LogTextBox).click();
		Thread.sleep(2000);
		Logger1.info("user has successefully clicked to the Log Text box");
	}

	@Test(priority = 4)
	@Then("^Click to add submit button$")
	public void click_to_add_submit_button() throws Throwable {

		this.wd.findElement(Text.Add_tab).click();
		Thread.sleep(2000);
		Logger1.info("user has successefully clicked to the Add Tab");
	}

}
