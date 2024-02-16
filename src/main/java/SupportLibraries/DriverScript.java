package SupportLibraries;

import org.openqa.selenium.WebDriver;

public class DriverScript {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver webDriver) {
        driver.set(webDriver);
    }

    public static void closeDriver() {
        getDriver().quit();
        driver.remove();
    }

}
