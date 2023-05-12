package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport {

    private static ExtentReports report;
    private static ExtentTest test;

    public static void info(String message) {
        if (test != null) {
            test.info(message);
        }
    }

}
