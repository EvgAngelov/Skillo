import Objects.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpTest extends Screenshot {

    @DataProvider(name = "getUser")
    public Object[][] getUser() {
        return new Object[][]{{"TShelby", "TShelby@mail.com", "TShelby", "TShelby"},};
    }

    @Test(dataProvider = "getUser")
    public void signUpTest(String username, String email, String password, String confirmPassword){

        WebDriver webDriver = super.getWebDriver();
        HomePage homePage = new HomePage(webDriver);
        Header header = new Header(webDriver);
        LoginPage loginPage = new LoginPage(webDriver);
        SignUpPage signUpPage = new SignUpPage(webDriver);

        homePage.navigateTo();
        Assert.assertTrue(homePage.isUrlLoaded(), "Home page is not loaded");

        header.clickLogin();

        Assert.assertTrue(loginPage.isUrlLoaded(), "Current page is not Login");

        signUpPage.clickButton();

        signUpPage.isUrlLoaded();

        signUpPage.fillInUserName(username);
        signUpPage.fillInEmail(email);
        signUpPage.fillInPassword(password);
        signUpPage.fillInConfirmPassword(confirmPassword);

        signUpPage.clickSignUp();

        signUpPage.waitForMessage();

        String actualText = signUpPage.waitForMessage();
        String expectedText = "Successful register!";
        Assert.assertEquals(actualText, expectedText,"Expected text is not equals with actual text!");
    }
}


