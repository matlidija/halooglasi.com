package baseHaloOglasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wdwait;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, 60);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("resolution", "2048x1536");
        driver.manage().window().maximize();
        driver.get("https://www.halooglasi.com/");
    }
    @After
    public void tearDown(){
    //    driver.close();
    }


}
