import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestKate {
    private WebDriver cd;
    @BeforeClass
    public void setUp() throws InterruptedException{
            System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        cd = new ChromeDriver();
        cd.manage().window().maximize();
        cd.get("http://fits.qauber.com/#/page/login");}
        @Test
    public void test1(){
        System.out.println("Kates test1");
        }
        @AfterClass(timeOut = 4000)
    public void fin(){
        System.out.println("this is after test");
        cd.close();
        }
}
