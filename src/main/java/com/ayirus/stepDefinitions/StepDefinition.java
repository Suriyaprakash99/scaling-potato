package com.ayirus.stepDefinitions;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.v117.performance.Performance;
import org.openqa.selenium.devtools.v117.performance.model.Metric;

import SupportLibraries.DriverScript;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {

	WebDriver driver;

	@Given("Setting up the Browser")
	public void browserSetUp() {
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.setBrowserVersion("117");
		driver = new ChromeDriver(chromeOption);
	}

	// WebDriver driver=DriverScript.getDriver();
	@Given("I navigate to {string}")
	public void i_navigate_to(String string) throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(string);
		Thread.sleep(10000);
	}

	@Then("I close browser")
	public void i_close_browser() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.setBrowserVersion("118");
		WebDriver chrome = new ChromeDriver(chromeOption);
		DevTools devTools = ((HasDevTools) chrome).getDevTools();
		devTools.createSession();
		devTools.send(Performance.enable(Optional.empty()));
		List<Metric> metricList = devTools.send(Performance.getMetrics());
		chrome.get("https://www.fb.com");
		chrome.manage().window().maximize();
		Thread.sleep(5000);
		for (Metric m : metricList) {
			System.out.println(m.getName() + " = " + m.getValue());
		}
		chrome.findElement(By.xpath(""));
		chrome.close();
		chrome.quit();
	}

}
