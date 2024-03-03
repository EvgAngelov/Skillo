import org.testng.Assert;
import org.testng.annotations.*;

public class GroupsTesting {

    @Test(groups = "smoke")
    public void testName(){
        System.out.println("My 1 check");
    }
    @Test(groups = "smoke")
    public void testName1(){
        System.out.println("My 2 check");
    }

    @Test(groups = "smoke")
    public void testName2(){
        System.out.println("My 3 check");
    }

    @Test(groups = "testGroup")
    public void testNameSecond(){
        System.out.println("My First Group check");
    }
    @Test(groups = "testGroup")
    public void testNameSecond1(){
        System.out.println("My Second Group check");
    }
    @Test()
    public void testNameTest(){
        System.out.println("My test check");
    }@Test()
    public void testNameTest2(){
        System.out.println("My test 1 check");
    }
}
