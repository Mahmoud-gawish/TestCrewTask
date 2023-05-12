package base;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.ITestResult;
import utils.Helper;
import utils.Logger;

import java.time.Duration;

import static utils.DriverFactory.getDriver;

public class TestBase {

    private final WebDriver driver = getDriver(Helper.getProperty("WebsiteSettings.properties", "browserName"));


    @BeforeTest(description = "navigate to the website and maximize the widow")
    public void setUp() {
        Logger.logStep(" Navigate to URL");
        driver.get(Helper.getProperty("WebsiteSettings.properties", "URL"));
        driver.manage().window().maximize();
    }

    @AfterTest(description = "close all browser instance")
    public void tearDown() {
        Logger.logStep("Close all Opened Browser Windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        if (driver != null) {
            driver.quit();
        }
    }

    // take screenshot when test case fail and add it in the screenshot folder
    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed");
            System.out.println("Taking Screenshot");
            Helper.captureScreenShot(driver, result.getName());
        }
    }
}
