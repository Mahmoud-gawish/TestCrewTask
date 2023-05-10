package pages;

import static locators.HomePageLocators.*;
import static locators.HomePageLocators.PREMIUM_CURRENCY;
import static utils.ElementActions.*;

public class HomePage {

    private HomePage(){

    }
    public static HomePage getHomePage(){
        return new HomePage();
    }

    public HomePage chooseEmiratesCountry(){
        clickElement(COUNTY_BUTTON.by());
        clickElement(COUNTRY_EMIRATES.by());
        return this;
    }

    public HomePage chooseOmanCountry(){
        clickElement(COUNTY_BUTTON.by());
        clickElement(COUNTRY_OMAN.by());
        return this;
    }

    public HomePage chooseJordanCountry(){
        clickElement(COUNTY_BUTTON.by());
        clickElement(COUNTRY_JORDAN.by());
        return this;
    }

    public String getMainWeeklyPrice(){
        waitUntilElementPresent(MAIN_WEEKLY_AMOUNT.by());
        return findElement(MAIN_WEEKLY_AMOUNT.by()).getText();
    }

    public String getLitePrice(){
        waitUntilElementPresent(LITE_PRICING.by());
        return findElement(LITE_PRICING.by()).getText();
    }

    public String getLiteCurrency(){
        waitUntilElementPresent(LITE_CURRENCY.by());
        return findElement(LITE_CURRENCY.by()).getText();
    }

    public String getMainPrice(){
        waitUntilElementPresent(MAIN_PRICING.by());
        return findElement(MAIN_PRICING.by()).getText();
    }

    public String getMainCurrency(){
        waitUntilElementPresent(MAIN_CURRENCY.by());
        return findElement(MAIN_CURRENCY.by()).getText();
    }

    public String getPREMIUMPrice(){
        waitUntilElementPresent(PREMIUM_PRICING.by());
        return findElement(PREMIUM_PRICING.by()).getText();
    }

    public String getPREMIUMCurrency(){
        waitUntilElementPresent(PREMIUM_CURRENCY.by());
        return findElement(PREMIUM_CURRENCY.by()).getText();
    }

}
