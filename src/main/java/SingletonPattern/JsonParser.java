package SingletonPattern;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonParser {

    public JSONObject parseJsonData() {
        try {
            System.out.println("Reading data for first time...");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("credentials.json")));
            String jsonContent = IOUtils.toString(bufferedReader);
            JSONObject jsonObject = new JSONObject(jsonContent);
            return jsonObject;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
