import org.testng.annotations.Test;

public class DependencyTests {
    @Test(groups = "smoke")
    public void testName(){
        System.out.println("My 1 check");
    }
    @Test(groups = "regression", dependsOnMethods = "registrationMеthod")
    public void testName1(){
        System.out.println("My 2 check");
    }
    @Test
    public void registrationMethod(){
        System.out.println("User registration");
    }
}
