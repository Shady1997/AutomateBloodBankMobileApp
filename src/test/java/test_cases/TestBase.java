package test_cases;

import org.example.capabilities.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.example.pages.PageBase;

import java.io.IOException;

public class TestBase extends Capabilities{

	// declare class properties
	static AndroidDriver<AndroidElement> driver;

	@BeforeTest
	public static void prepare() throws IOException, InterruptedException {
		// TODO start application with appium
		driver = baseCapabilities("AppName");
		PageBase.captureScreenshot(driver, "startApp");// take screenshot for app when start
	}

	@AfterClass
	public static void TearDown() {
		driver.quit();
	}

}
