package pages;

import io.qameta.allure.Step;

import static locators.HomePageLocators.*;
import static locators.HomePageLocators.PREMIUM_CURRENCY;
import static utils.ElementActions.*;

public class HomePage {

    private HomePage() {

    }

    public static HomePage getHomePage() {
        return new HomePage();
    }

    @Step("choose country / by value")
    public HomePage ChooseCountry(String Country) {
        if (Country == "Emirates") {
            clickElement(COUNTY_BUTTON.by());
            clickElement(COUNTRY_EMIRATES.by());

        } else if (Country == "Oman") {
            clickElement(COUNTY_BUTTON.by());
            clickElement(COUNTRY_OMAN.by());

        } else if (Country == "Jordan") {
            clickElement(COUNTY_BUTTON.by());
            clickElement(COUNTRY_JORDAN.by());
        }
        return this;
    }

    @Step("get main weekly price")
    public String getMainWeeklyPrice() {
        waitUntilElementPresent(MAIN_WEEKLY_AMOUNT.by());
        return findElement(MAIN_WEEKLY_AMOUNT.by()).getText();
    }

    @Step("get Lite price")
    public String getLitePrice() {
        waitUntilElementPresent(LITE_PRICING.by());
        return findElement(LITE_PRICING.by()).getText();
    }

    @Step("get Lite currency")
    public String getLiteCurrency() {
        waitUntilElementPresent(LITE_CURRENCY.by());
        return findElement(LITE_CURRENCY.by()).getText();
    }

    @Step("get Main price")
    public String getMainPrice() {
        waitUntilElementPresent(MAIN_PRICING.by());
        return findElement(MAIN_PRICING.by()).getText();
    }

    @Step("get Main currency")
    public String getMainCurrency() {
        waitUntilElementPresent(MAIN_CURRENCY.by());
        return findElement(MAIN_CURRENCY.by()).getText();
    }

    @Step("get Premium price")
    public String getPREMIUMPrice() {
        waitUntilElementPresent(PREMIUM_PRICING.by());
        return findElement(PREMIUM_PRICING.by()).getText();
    }

    @Step("get Premium currency")
    public String getPREMIUMCurrency() {
        waitUntilElementPresent(PREMIUM_CURRENCY.by());
        return findElement(PREMIUM_CURRENCY.by()).getText();
    }

}
