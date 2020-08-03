import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BT4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement AllJewellery=driver.findElement(By.xpath("//li[@class='menuparent repb nav-goldmine-link']/following-sibling::li/a[@title='Rings']"));
		Actions a = new Actions(driver);
		a.moveToElement(AllJewellery).perform();
		driver.findElement(By.xpath("//a[contains(.,'Engagement')]/parent::li/following-sibling::li/a[@title='Diamond Rings']")).click();
		driver.findElement(By.xpath("//img[@alt='The Nury Vanki Ring']")).click();
        String parent=driver.getWindowHandle();     //parent window handle
        Set<String> tabs= driver.getWindowHandles();
		for(String child:tabs)
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		WebElement buynow =driver.findElement(By.xpath("//div/div[contains(.,'* This field is required')]"));
	    WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.textToBePresentInElement(buynow,"This field is required"));
	    wait.until(ExpectedConditions.elementToBeClickable(buynow));
	    System.out.println("done");
		

		

}
}