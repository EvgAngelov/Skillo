import Objects.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExitTest {
    ChromeDriver webDriver;
    private boolean userReg = false;
    @BeforeMethod(alwaysRun = true)
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod(alwaysRun = true)
    public void afterTest(){
        if (webDriver != null) {
            webDriver.close();
        }
        if(userReg == true){
            //DB call for detele user with id .....
            // Automation-[10 random numbers]-[10 random chars]-test@domain.com
        }
    }

    @DataProvider(name="getUser")
    public Object[][] getUsers(){
        return new Object[][]{
                //To pass the first data object the userId needs to be changed to 5508
                {"Shelby","Shelby", "5465"},
        };
    }

    @Test(dataProvider = "getUser")
    public void loginTest(String username, String password, String userId) {

        HomePage homePage = new HomePage(webDriver);
        Header header = new Header(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        ProfilePage profilePage = new ProfilePage(webDriver);
        ExitPage exitPage = new ExitPage(webDriver);

        homePage.navigateTo();
        Assert.assertTrue(homePage.isUrlLoaded(), "Home page is not loaded");

        header.clickLogin();

        Assert.assertTrue(loginPage.isUrlLoaded(), "Current page is not Login");

        loginPage.fillInUserName(username);
        loginPage.fillInPassword(password);

        loginPage.checkRememberMe();

        Assert.assertTrue(loginPage.isCheckedRememberMe(), "Remember me checkbox is not checked.");

        loginPage.clickSignIn();

        header.clickProfile();

        Assert.assertTrue(profilePage.isUrlLoaded(userId), "Current page in not profile page for " + userId + " user");

        Assert.assertTrue(profilePage.isUrlLoaded(), "Current page is not profile page");

//        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
//        WebElement exitButton = wait.until(ExpectedConditions.visibilityOf(webDriver.findElement
//                (By.xpath("//*[@class='nav-link']//*[@class='fas fa-sign-out-alt fa-lg']"))));

        exitPage.clickLogOut();

//        WebDriverWait waitForMessage = new WebDriverWait(this.webDriver, Duration.ofSeconds(30));
//        WebElement postLikeMessage = waitForMessage.until(ExpectedConditions.visibilityOf(webDriver.findElement
//                (By.xpath("//*[@id='toast-container']//*[aria-label='Successful logout!']"))));
//        Actions actionsForElements = new Actions(webDriver);
//        actionsForElements.moveToElement(postLikeMessage).perform();

        exitPage.waitForMessage();

//        String expectedText = "Successful logout!";
//        String actualText = postLikeMessage.getText();
//        Assert.assertEquals(actualText,expectedText, "The actual text is not matching the expected text");
    }
}
