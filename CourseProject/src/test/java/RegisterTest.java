import Objects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class RegisterTest {
    ChromeDriver webDriver;
    //private boolean userReg = false;
    @BeforeMethod(alwaysRun = true)
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        if (webDriver != null) {
            webDriver.close();
        }
    }

    @DataProvider(name="getUser")
    public Object[][] getUser(){
        return new Object[][]{
                //To pass the first data object the userId needs to be changed to 5508
                {"Shagi", "dsfsay@mail.com", "sdasdas", "sdasdas"},
        };
    }

    @Test (dataProvider = "getUser")
    public void registerTest(String username, String email, String password, String confirmPassword, String usedId) {

        HomePage homePage = new HomePage(webDriver);
        Header header = new Header(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        RegisterPage registerPage = new RegisterPage(webDriver);

        homePage.navigateTo();
        Assert.assertTrue(homePage.isUrlLoaded(), "Home page is not loaded");

        header.clickLogin();

        Assert.assertTrue(loginPage.isUrlLoaded(), "Current page is not Login");

        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        WebElement registerButton = wait.until(ExpectedConditions.visibilityOf(webDriver.findElement
                (By.xpath("/html/body/app-root/div[2]/app-login/div/div/form/p[2]/a"))));
        registerButton.click();

        registerPage.fillInUserName(username);
        registerPage.fillInEmail(email);
        registerPage.fillInPassword(password);
        registerPage.fillInConfirmPassword(confirmPassword);

        registerPage.clickSignUp();



    }




}
