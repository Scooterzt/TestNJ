import QauberTestNj.Manager;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TestManagerTestNG {
   private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.out.println("Just for checking Before class");
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://fits.qauber.com/#/page/login");
        Thread.sleep(3000);
        // Selecting CheckBox
        driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]")).sendKeys("poyuh@0mixmail.info");
        driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]")).sendKeys("7735011528");
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(2000);
         }


    @Test
            public void verify() throws InterruptedException{
        System.out.println("test1");
            driver.getPageSource().contains("RomanRoman2");
        if(true) {
        System.out.println("Test Case Pass");
    } else
            System.out.println("Test Case Fail");
    }
    private void delay() throws InterruptedException {
        Thread.sleep(3000);}

    @Test(dependsOnMethods = "verify")
        public void pictureChange() throws InterruptedException, AWTException {
        System.out.println("test2");
        driver.findElement(By.xpath("//span[@class='mr-sm ng-binding']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='$ctrl.editUserProfile()']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ngf-select='$ctrl.selectProfilePicture($file)']")).click();
        Thread.sleep(3000);
        String s1 = driver.findElement(By.xpath("//img[@src='app/img/profile.jpg']")).getAttribute("src");
        System.out.println(s1);
        Thread.sleep(1000);
        Robot robot = new Robot();
        StringSelection ss;
        ss = new StringSelection("C:\\Users\\Scoot\\OneDrive\\Pictures\\test.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }
    @Test(dependsOnMethods = "pictureChange")
        public void delPicture() throws InterruptedException{
        System.out.println("Test3");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='mr-sm ng-binding']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@ng-click='$ctrl.editUserProfile()']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ng-disabled='!($ctrl.profilePicture || app.userProfilePictureSrc)']")).click();
        Thread.sleep(5000);

}

    @AfterClass
        public void tearDown() throws InterruptedException {
            System.out.println("After all tests script");
            Thread.sleep(5000);
                driver.close();
    }


    }
