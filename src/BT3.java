import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BT3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.bluestone.com");
		
		Thread.sleep(5000);
		
		
		//driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery/rings.html']/parent::div"));

		WebElement Rings=driver.findElement(By.xpath("//li[@class='menuparent repb nav-goldmine-link']/following-sibling::li/a[@title='Rings']"));
		//li[@class='menuparent repb nav-goldmine-link']/following-sibling::li/a[@title='Rings']
        Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		
		a.moveToElement(Rings).perform();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//a[contains(.,'Engagement')]/parent::li/following-sibling::li/a[@title='Diamond Rings']")).click();
		//div[contains(.,'By Metals & Stones')]/parent::div/following::ul/li/a[@title='Diamond Rings']
		WebElement price=driver.findElement(By.xpath("//span[@class='view-by-wrap title style-outline i-right']"));
        Actions B = new Actions(driver);
		
		Thread.sleep(2000);
		
		B.moveToElement(price).perform();
		
		driver.findElement(By.xpath("//a[contains(.,'Price Low to High ')]")).click();
		
		//a[contains(.,'Price Low to High ')]
		
		
		//span[@class='view-by-wrap title style-outline i-right']
	
}
}
