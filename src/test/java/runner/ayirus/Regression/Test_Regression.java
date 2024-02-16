package runner.ayirus.Regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SupportLibraries.DriverScript;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.PickleWrapper;

@CucumberOptions(features= {"src/test/resources/features"},
glue= {"com.ayirus.stepDefinitions"},monochrome=true,plugin= {"pretty","html:evidence/htmlReport.html"},dryRun=false)


public class Test_Regression extends AbstractTestNGCucumberTests{
	@DataProvider(parallel = true)
    @Override
    public Object[][] scenarios() {
        return super.scenarios();
    }

    // Add your other TestNG methods or Cucumber hooks if needed

    @Test(dataProvider = "scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        super.runScenario(pickleWrapper, featureWrapper);
    }
    
	/*
	 * @BeforeMethod public void setup() { ChromeOptions chromeOption= new
	 * ChromeOptions(); chromeOption.setBrowserVersion("117"); WebDriver driver= new
	 * ChromeDriver(chromeOption); DriverScript.setDriver(driver); }
	 * 
	 * @AfterMethod public void tearDown() { DriverScript.closeDriver(); // Close
	 * browser instance }
	 */

}
