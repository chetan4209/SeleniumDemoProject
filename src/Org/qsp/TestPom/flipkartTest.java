package Org.qsp.TestPom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Org.qsp.Pom.flipkart;
public class flipkartTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        flipkart sh = new flipkart(driver);
        sh.click();
        Thread.sleep(2000);
        sh.mouseOver(driver);
        Thread.sleep(2000);
        sh.mi();
        sh.phone();
        Thread.sleep(2000);
        sh.switchTab(driver);
        Thread.sleep(2000);
        sh.Buy();
		

	}

}
