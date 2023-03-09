package StepDefinitions;

import org.testng.annotations.Test;
import Base.BaseClass;
import Base.Logger1;
import Screens.Animation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@Test
public class AnimationStep extends BaseClass {
	@Test(priority = 1)
	@Given("^User click to the Animation$")
	public void user_click_to_the_Animation() throws Throwable {
		this.wd.findElement(Animation.Animation_Tap).click();
		Thread.sleep(3000);
		Logger1.info("user has successefully clicked to the Animation Button");
	}

	@Test(priority = 2)
	@Then("^Click to the Bouncing Balls$")
	public void click_to_the_Bouncing_Balls() throws Throwable {
		this.wd.findElement(Animation.Bouncing_Tap).click();
		Thread.sleep(3000);
		Logger1.info("user has successefully clicked to the Bouncing Balls");

	}

	@Test(priority = 3)
	@Then("^Tap on the Screen$")
	public void tap_on_the_Screen() throws Throwable {
		this.wd.findElement(Animation.Screen_Tap).click();
		Thread.sleep(3000);
		Logger1.info("user has successefully clicked to the Screen");

	}

	@Test(priority = 4)
	@Then("^Click to the Cloning$")
	public void click_to_the_Cloning() throws Throwable {
		this.wd.findElement(Animation.Cloning_Tap).click();
		Thread.sleep(3000);
		Logger1.error("Failed to click to the Cloning button");

	}

	@Test(priority = 5)
	@Then("^Click to the Run Button$")
	public void click_to_the_Run_Button() throws Throwable {
		this.wd.findElement(Animation.RunButton_Tap).click();
		Thread.sleep(3000);
		Logger1.info("User successfully clicked to the Run Button");

	}

}
