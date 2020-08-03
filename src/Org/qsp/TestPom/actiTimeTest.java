package Org.qsp.TestPom;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import Org.qsp.Pom.actitimeHome;
import Org.qsp.Pom.seleniumHome;

public class actiTimeTest {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actitimeHome sh = new actitimeHome(driver);
        sh.sendText("admin");
        Thread.sleep(2000);
        sh.text("manager");
        Thread.sleep(2000);
        sh.clickLogin();
        Thread.sleep(3000);
        TakesScreenshot ts = (TakesScreenshot) driver;
		File ScreenShot = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsave = new File("./ScreenShot/actitime1.png");
        Files.copy(ScreenShot, screenshotsave);
              

	}

}


