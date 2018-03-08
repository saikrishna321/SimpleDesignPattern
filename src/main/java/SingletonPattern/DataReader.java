package SingletonPattern;

import org.json.JSONObject;

public class DataReader {

    private static DataReader instance;
    private final JSONObject data;

    private DataReader() {
        data = new JsonParser().parseJsonData(); //Some costly call to get data and it does not change.
    }

    public static DataReader getInstance() {
        if(instance == null) {
            instance = new DataReader();
        }
        return instance;
    }

    public JSONObject getData() {
        return data;
    }
}
