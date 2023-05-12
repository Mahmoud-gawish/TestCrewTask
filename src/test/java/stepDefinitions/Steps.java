package stepDefinitions;

import data.PricingData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.Helper;

import java.time.Duration;

import static data.PricingData.getPricingData;
import static org.testng.Assert.assertEquals;
import static pages.HomePage.getHomePage;
import static utils.DriverFactory.getDriver;

public class Steps {
    HomePage homePage = getHomePage();
    PricingData pricingData = getPricingData();

    private final WebDriver driver = getDriver(Helper.getProperty("WebsiteSettings.properties", "browserName"));

    @Given("user is in the Home PAge")
    public void user_is_in_the_home_p_age() {

        driver.get(Helper.getProperty("WebsiteSettings.properties", "URL"));
        driver.manage().window().maximize();
    }

    @When("user choose Emirate as a Country")
    public void user_choose_emirate_as_a_country() {
        homePage.ChooseCountry("Emirate");
    }

    @Then("the User Can See All the Pricing Packages")
    public void the_user_can_see_all_the_pricing_packages() {

        // Validate Weekly Price
        String WeeklyPrice = homePage.getMainWeeklyPrice();
        assertEquals(WeeklyPrice, pricingData.getEmiratesWeeklyPrice());

        // validate Lite Package
        String litePricing = homePage.getLitePrice();
        assertEquals(litePricing, pricingData.getLiteEmiratePrice());

        String Currency = homePage.getLiteCurrency();
        assertEquals(Currency, pricingData.getEmirateCurrency());

        // Validate Main Package
        String mainPricing = homePage.getMainPrice();
        assertEquals(mainPricing, pricingData.getMainEmiratePrice());

        Currency = homePage.getMainCurrency();
        assertEquals(Currency, pricingData.getEmirateCurrency());

        // validate Premium Package
        String premiumPricing = homePage.getPREMIUMPrice();
        assertEquals(premiumPricing, pricingData.getPremiumEmiratePrice());

        Currency = homePage.getPREMIUMCurrency();
        assertEquals(Currency, pricingData.getEmirateCurrency());


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        if (driver != null) {
            driver.quit();
        }
    }
}
