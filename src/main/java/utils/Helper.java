package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Logger;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.fail;


public class Helper {

    public static JSONObject readJsonFile(String filePath) {
        JSONObject obj = null;
        try {
            FileReader reader = new FileReader(filePath);
            JSONParser parser = new JSONParser();
            obj = (JSONObject) parser.parse(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }

    private  static FileReader reader =null;
    private static String propRoot = "src/main/resources/";
    private static Properties p = new Properties();

    public static String getProperty(String propertyFileName, String propertyName){
        String propPath = propRoot + propertyFileName;

        try {
            reader = new FileReader(propPath);
        }catch (FileNotFoundException e){

            Logger.getLogger("No found in the given path" + propPath);
            e.printStackTrace();
        }

        try {
            p.load(reader);
        }catch (IOException e){
            Logger.getLogger("could not find any properties with the given property name" + propertyName);
            e.printStackTrace();
        }

        return p.getProperty(propertyName);
    }

    public static String getCurrentTime(String dateFormate){
        String currentTime = "" ;
        try {
            currentTime = new SimpleDateFormat(dateFormate).format(new Date());
        }catch (IllegalArgumentException e){
            Logger.getLogger(e.getMessage());
            fail(e.getMessage());
        }
        return currentTime;
    }

    // method to take screenshot when test case fail
    public static void captureScreenShot(WebDriver driver, String screenShotName) {
        //make a destination for the screenshot
        Path dest = Paths.get("./Screenshotes",screenShotName+".png");
        try {
            Files.createDirectories(dest.getParent());
            FileOutputStream out = new FileOutputStream(dest.toString());
            out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
            out.close();
        } catch (IOException e) {

            System.out.println("Exception while taking screenshot"+e.getMessage());
        }
    }
}
