import org.testng.annotations.*;

public class ChildClass extends BaseClass{
    @BeforeMethod
    public void beforeMethodChild(){
        System.out.println("Child Before Test Method");
    }
    @AfterClass
    public void afterClassChild(){
        System.out.println("Child After Class Method");
    }
    @Test
    public void testBase(){
        System.out.println("My name is George");
    }
}
