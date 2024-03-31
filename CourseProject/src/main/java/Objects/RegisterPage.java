package Objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage {
    public static final String PAGE_URL = "http://training.skillo-bg.com:4200/users/register";
    private final WebDriver webDriver;

    public RegisterPage(WebDriver driver){
        this.webDriver = driver;
    }

    public boolean isUrlLoaded(){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.urlToBe(PAGE_URL));
    }

    public void fillInUserName(String username){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        WebElement usernameTextField = wait.until(ExpectedConditions.visibilityOf(webDriver.
                findElement(By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[1]/input"))));
        usernameTextField.sendKeys(username);
    }

    public void fillInEmail(String email){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        WebElement usernameTextField = wait.until(ExpectedConditions.visibilityOf(webDriver.
                findElement(By.xpath("/html/body/app-root/div[2]/app-register/div/div/form/div[2]/input"))));
        usernameTextField.sendKeys(email);
    }

    public void fillInPassword(String password){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        WebElement usernameTextField = wait.until(ExpectedConditions.visibilityOf(webDriver.
                findElement(By.xpath("//*[@id='defaultRegisterFormPassword']"))));
        usernameTextField.sendKeys(password);
    }

    public void fillInConfirmPassword(String confirmPassword){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        WebElement usernameTextField = wait.until(ExpectedConditions.visibilityOf(webDriver.
                findElement(By.xpath("//*[@id='defaultRegisterFormPassword']"))));
        usernameTextField.sendKeys(confirmPassword);
    }

    public void clickSignUp(){
        WebDriverWait wait = new WebDriverWait(this.webDriver, Duration.ofSeconds(15));
        WebElement signUpButton = wait.until(ExpectedConditions.elementToBeClickable(webDriver.findElement
                (By.xpath("//*[@id='sign-in-button']"))));
        signUpButton.click();
    }



}
