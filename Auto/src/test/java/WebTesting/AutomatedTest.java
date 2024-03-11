package WebTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AutomatedTest {
    ChromeDriver webDriver;

    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
}
