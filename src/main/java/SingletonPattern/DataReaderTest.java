package SingletonPattern;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataReaderTest {
    JsonParser jsonParser = new JsonParser();

    @Test
    public void singleton() {
        DataReader instance1 = DataReader.getInstance();
        DataReader instance2 = DataReader.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

        assertEquals(DataReader.getInstance(), DataReader.getInstance());
    }

    @Test
    public void notSingleton() {
        jsonParser.parseJsonData();
        jsonParser.parseJsonData();
    }
}
