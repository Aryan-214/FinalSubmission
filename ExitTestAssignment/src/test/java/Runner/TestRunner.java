package Runner;

import org.testng.annotations.Listeners;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features= {"src/test/java/Feature"},
		glue= {"StepDefinitions"},
		//strict= true,
		//monochrome=true,
		tags= {"@tag1"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:report/ExtentReport.html"},
		dryRun = false
		)
@Listeners({ExtentITestListenerClassAdapter.class})		
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}