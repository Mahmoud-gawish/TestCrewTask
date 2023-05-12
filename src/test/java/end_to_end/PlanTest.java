package end_to_end;

import base.TestBase;
import data.PricingData;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.HomePage;

import static data.PricingData.getPricingData;
import static org.testng.Assert.assertEquals;
import static pages.HomePage.getHomePage;

@Epic("JAWWY")
@Feature("check packages plan for Emirates , Oman & Jordan")
public class PlanTest extends TestBase {

    HomePage homePage = getHomePage();
    PricingData pricingData = getPricingData();
    @Severity(SeverityLevel.CRITICAL)
    @Description("test Emirates plan")
    @Test(priority = 1)
    public void TestEmiratesPlans() {
        String WeeklyPrice = homePage
                .ChooseCountry("Emirates").
                getMainWeeklyPrice();
        // Validate Weekly Price
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
    }

    @Severity(SeverityLevel.CRITICAL)
    @Description("test Oman plan")
    @Test(priority = 2)
    public void TestOmanPlans() {

        String WeeklyPrice = homePage
                .ChooseCountry("Oman").
                getMainWeeklyPrice();
        // Validate Weekly Price
        assertEquals(WeeklyPrice, pricingData.getOmanWeeklyPrice());

        // validate Lite Package
        String litePricing = homePage.getLitePrice();
        assertEquals(litePricing, pricingData.getLiteOmanPrice());

        String Currency = homePage.getLiteCurrency();
        assertEquals(Currency, pricingData.getOmanCurrency());

        // Validate Main Package
        String mainPricing = homePage.getMainPrice();
        assertEquals(mainPricing, pricingData.getMainOmanPrice());

        Currency = homePage.getMainCurrency();
        assertEquals(Currency, pricingData.getOmanCurrency());

        // validate Premium Package
        String premiumPricing = homePage.getPREMIUMPrice();
        assertEquals(premiumPricing, pricingData.getPremiumOmanPrice());

        Currency = homePage.getPREMIUMCurrency();
        assertEquals(Currency, pricingData.getOmanCurrency());
    }
    @Severity(SeverityLevel.CRITICAL)
    @Description("test Jordan plan")
    @Test(priority = 3)
    public void TestJordanPlans() {
        String WeeklyPrice = homePage
                .ChooseCountry("Jordan").
                getMainWeeklyPrice();
        // Validate Weekly Price
        assertEquals(WeeklyPrice, pricingData.getJordanWeeklyPrice());

        // validate Lite Package
        String litePricing = homePage.getLitePrice();
        assertEquals(litePricing, pricingData.getLiteJordanPrice());

        String Currency = homePage.getLiteCurrency();
        assertEquals(Currency, pricingData.getJordanCurrency());

        // Validate Main Package
        String mainPricing = homePage.getMainPrice();
        assertEquals(mainPricing, pricingData.getMainJordanPrice());

        Currency = homePage.getMainCurrency();
        assertEquals(Currency, pricingData.getJordanCurrency());

        // validate Premium Package
        String premiumPricing = homePage.getPREMIUMPrice();
        assertEquals(premiumPricing, pricingData.getPremiumJordanPrice());

        Currency = homePage.getPREMIUMCurrency();
        assertEquals(Currency, pricingData.getJordanCurrency());

    }
}
