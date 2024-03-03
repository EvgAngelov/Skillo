import org.testng.Assert;
import org.testng.annotations.*;
public class MyFirstTestClass {

    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("Before suite: Clean all DBs");
    }

    @BeforeTest(alwaysRun = true)
    public void testBeforeTest(){
        System.out.println("Before test: Open site URL");
    }

    @BeforeMethod
    public void testBeforeMethod(){
        System.out.println("Before method: Verify site is open");
    }

    @Test(groups = "smoke")
    public void firstTestName(){
        System.out.println("My first check");
    }

    @Test(groups = "testGroup")
    public void testNameSecond(){
        System.out.println("My second check");
        Assert.assertFalse(true);
    }

    @AfterMethod(groups = "smoke")
    public void testAfterMethod(){
        System.out.println("After method: verify check");
    }

    @AfterTest(alwaysRun = false)
    public void testAfterTest(){
        System.out.println("After test: close site");
    }

    @AfterSuite(groups = "test", alwaysRun = true)
    public void testAfterSuite(){
        System.out.println("After suite: check DB");
    }

}
