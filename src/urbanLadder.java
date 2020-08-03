import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class urbanLadder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//	Thread.sleep(10000);
		// a[@class='close-reveal-modal hide-mobile']
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();

	//	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Sofa", Keys.ENTER);
		// Thread.sleep(10000);
		// driver.findElementByXPath(" //a[@class='close-reveal-modal
		// hide-mobile']").click();

	}
}
