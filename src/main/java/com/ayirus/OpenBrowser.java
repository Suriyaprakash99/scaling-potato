package com.ayirus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenBrowser {
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions chromeOption= new ChromeOptions();
	chromeOption.setBrowserVersion("118");
	WebDriver chrome= new ChromeDriver(chromeOption);
	chrome.get("https://www.google.com");
	Thread.sleep(5000);
	chrome.quit();
	}
	
}
