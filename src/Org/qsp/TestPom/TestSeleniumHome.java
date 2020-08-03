package Org.qsp.TestPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Org.qsp.Pom.seleniumHome;

public class TestSeleniumHome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.selenium.dev/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        seleniumHome sh = new seleniumHome(driver);
        sh.sendText("java");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        sh.sendText("testNG");

	}

}
