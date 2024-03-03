import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Base Before Test Method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Base After Class method");
    }
    @Test
    public void testBase(){
        System.out.println("My name is George");
    }
}
