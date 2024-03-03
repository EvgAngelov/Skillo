import org.testng.annotations.Test;

public class priorityTest {
    @Test(groups = "smoke", priority = 0)
    public void testName(){
        System.out.println("My 1 check");
    }
    @Test(groups = "smoke", priority = 1)
    public void testName1(){
        System.out.println("My 2 check");
    }

    @Test(groups = "smoke", priority = -1)
    public void testName2(){
        System.out.println("My 3 check");
    }
    @Test(groups = "smoke", priority = -2)
    public void testName3(){
        System.out.println("My 4 check");
    }
}
