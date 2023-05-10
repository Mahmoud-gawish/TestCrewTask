package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import settings.WebsiteSettings;

import java.time.Duration;

import static utils.DriverFactory.getDriver;

public class TestBase {

    private final WebDriver driver = getDriver(WebsiteSettings.browserName);


    @BeforeTest
    public void setUp() {

        driver.get(WebsiteSettings.URL);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        if (driver != null) {
            driver.quit();
        }
    }
}
