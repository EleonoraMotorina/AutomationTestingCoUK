package browserSettings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSettings {

    public static WebDriver driver;
    private String url;
    private Properties prop;

    public BrowserSettings () throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties");
        prop.load(data);
    }

    public WebDriver getDriver() throws IOException {
        if(prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if (prop.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\geckodriver33.exe" );
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.edge.driver",
                    System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\msedgedriver.exe" );
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public String getUrl() {
        url = prop.getProperty("url");
        return url;
    }
}
