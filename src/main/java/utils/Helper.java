package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

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
}
