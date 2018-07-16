package firstpageobject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends BasePage
{
    static Properties prop;
    static FileInputStream input;

    public String getproperty(String key) {
        prop = new Properties();
        try {
            input = new FileInputStream("src\\test\\Resourses\\TestData\\TestDataConfig.properties");
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
