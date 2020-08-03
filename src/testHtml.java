import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testHtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("file:///C:/Users/hp/Desktop/html/test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='textA']")).sendKeys("Whats Your Name?");
		
		driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Chetan");
		WebElement ele =driver.findElement(By.xpath("//input[@name='textB']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.textToBePresentInElement(ele, "Whats Your Name?"));
		
	    driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Chetan");
	    System.out.println("done");

}
}