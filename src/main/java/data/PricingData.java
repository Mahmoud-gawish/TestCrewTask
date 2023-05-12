package data;

import org.json.simple.JSONObject;
import utils.Helper;

import static utils.Helper.readJsonFile;

public class PricingData {

    private final JSONObject jsonData;

    private PricingData() {
        final String filePath = Helper.getProperty("WebsiteSettings.properties", "pricingJsonFile");
        jsonData = readJsonFile(filePath);
    }

    public static PricingData getPricingData() {
        return new PricingData();
    }

    public String getEmiratesWeeklyPrice() {
        return (String) jsonData.get("emiratesWeeklyPrice");
    }

    public String getLiteEmiratePrice() {
        return (String) jsonData.get("emiratesLitePricing");
    }

    public String getEmirateCurrency() {
        return (String) jsonData.get("emiratesCurrency");
    }

    public String getMainEmiratePrice() {
        return (String) jsonData.get("emiratesMainPricing");
    }

    public String getPremiumEmiratePrice() {
        return (String) jsonData.get("emiratesPremiumPricing");
    }

    public String getOmanWeeklyPrice() {
        return (String) jsonData.get("omanWeeklyPrice");
    }

    public String getLiteOmanPrice() {
        return (String) jsonData.get("omanLitePricing");
    }

    public String getOmanCurrency() {
        return (String) jsonData.get("omanCurrency");
    }

    public String getMainOmanPrice() {
        return (String) jsonData.get("omanMainPricing");
    }

    public String getPremiumOmanPrice() {
        return (String) jsonData.get("omanPremiumPricing");
    }

    /////
    public String getJordanWeeklyPrice() {
        return (String) jsonData.get("JordanWeeklyPrice");
    }

    public String getLiteJordanPrice() {
        return (String) jsonData.get("JordanLitePricing");
    }

    public String getJordanCurrency() {
        return (String) jsonData.get("JordanCurrency");
    }

    public String getMainJordanPrice() {
        return (String) jsonData.get("JordanMainPricing");
    }

    public String getPremiumJordanPrice() {
        return (String) jsonData.get("JordanPremiumPricing");
    }
}
