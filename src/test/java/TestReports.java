import org.testng.annotations.*;

public class TestReports {
    @BeforeClass(alwaysRun = true)
    public void classSetup(){
        System.out.println("Its class report setup");
    }

    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("test1");}
    @Test(groups = {"smoke"},expectedExceptions = ArithmeticException.class)
    public void testexception(){
        System.out.println("test exception");
        System.out.println(4/0);}
    @Test(groups = {"stress"})
    public void test2(){
        System.out.println("test2");}
    @Test(groups = {"stress"})
    public void test3(){
        System.out.println("test3");}
    @Test(groups = {"stress"})
    public void test4(){
        System.out.println("test4");}
    @Test(groups = {"smoke"}, timeOut = 2000)
    public void test5() throws InterruptedException {
        System.out.println("test5");

    }


    @AfterMethod(alwaysRun = true)
    public void cleanupMethod(){
        System.out.println("cleanup report method");
    }

    @BeforeMethod(alwaysRun = true)
    public void setupMethod(){
        System.out.println("setup report method");
    }

    @AfterClass(alwaysRun = true)
    public void classCleanup(){
        System.out.println("class report clean up");}

    @AfterSuite(alwaysRun = true)
    public void siuteSetup(){
        System.out.println("suit setup");
        }
    @AfterSuite(alwaysRun = true)
    public void suiteCleanup(){
        System.out.println("suite cleanup");}
}
