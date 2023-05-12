package utils;

import io.qameta.allure.Step;

public class Logger {

    @Step("{message}")
    public static void logStep(String message) {
        //String timeStamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS a").format(new Date());
        System.out.println("<" + Helper.getCurrentTime("dd-MM-yyyy HH:mm:ss.SSS a") + "> " + message);
        ExtentReport.info(message);
    }
}
