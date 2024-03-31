package WebTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AcceptCookies {
    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void test1(){
        ChromeDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.kaldata.com/forums/login/");
        webDriver.manage().window().maximize();

        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//*[@class='fc-dialog-container']")));
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement checkConsent = webDriver.findElement(By.xpath("//*[@class='fc-button fc-cta-consent fc-primary-button']/div"));

        checkConsent.click();

        WebElement checkBox = webDriver.findElement(By.xpath("//*[@id='remember_me_checkbox']"));

        String checkBoxText = checkBox.getText();
        System.out.println("This is the checkBox text: " + checkBoxText);
        checkBox.click();

        webDriver.close();
    }
}
