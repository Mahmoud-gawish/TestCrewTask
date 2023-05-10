package locators;

import org.openqa.selenium.By;

public enum HomePageLocators {
    COUNTY_BUTTON(By.id("country")),
    //emirates
    COUNTRY_EMIRATES(By.id("ae")),
    //jordan
    COUNTRY_JORDAN(By.id("jo")),
    //oman
    COUNTRY_OMAN(By.id("om")),
    MAIN_WEEKLY_AMOUNT(By.cssSelector(".trial-cost>b")),
    LITE_PRICING(By.cssSelector("#currency-لايت>b")),
    LITE_CURRENCY(By.cssSelector("#currency-لايت>I")),
    MAIN_PRICING(By.cssSelector("#currency-الأساسية>b")),
    MAIN_CURRENCY(By.cssSelector("#currency-الأساسية>I")),
    PREMIUM_PRICING(By.cssSelector("#currency-بريميوم>b")),
    PREMIUM_CURRENCY(By.cssSelector("#currency-بريميوم>I"));
    private final By locator;

    HomePageLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
