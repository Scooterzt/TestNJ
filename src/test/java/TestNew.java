import org.testng.annotations.*;

public class TestNew {
    @BeforeClass
        public void classSetup(){
        System.out.println("Its class setup");
    }

    @Test
    public void test1(){
    System.out.println("test1");
}
    @Test
    public void test2(){
        System.out.println("test2");}


    @AfterMethod
    public void cleanupMethod(){
        System.out.println("cleanup method");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("setup method");
    }

    @AfterClass
    public void classCleanup(){
        System.out.println("class clean up");}
    }
