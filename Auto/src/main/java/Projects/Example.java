package Projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        testSelenium();
    }
    public static void testSelenium(){
        ChromeDriver webDriver = new ChromeDriver();
        webDriver.get("http://training.skillo-bg.com:4200/posts/all");
        webDriver.manage().window().maximize();
        webDriver.close();
    }
}
