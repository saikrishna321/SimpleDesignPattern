package SingletonPattern;


import org.junit.Test;

public class SingletonTest {
    JsonParser jsonParser = new JsonParser();

    @Test
    public void singelton() {
        Singleton.getInstance().hashCode();
        Singleton.getInstance().hashCode();
    }

    @Test
    public void notSingleton() {
        jsonParser.parseJsonData();
        jsonParser.parseJsonData();
    }
}
