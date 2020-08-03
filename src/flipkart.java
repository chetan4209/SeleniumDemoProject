import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize(); // maximize browser window
	    driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9518729769");
		//input[@class='_2zrpKA _1dBPDZ']
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("chetan4209", Keys.ENTER);
		Thread.sleep(5000);
		WebElement Electrinics=driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(Electrinics).perform();
		driver.findElement(By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::ul[@class='QPOmNK']/li")).click();
		
	
	
	
	
		
	}

}
