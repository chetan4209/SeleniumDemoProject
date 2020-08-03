import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urabanladder2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.urbanladder.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		// a[@class='close-reveal-modal hide-mobile']
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("sofa", Keys.ENTER);
		
	//	WebElement username =driver.findElement(By.xpath("//li[@class='topnav_item livingunit']/span[@class='topnav_itemname']"));
		//b[text()='admin']
		
	//	String usertext = username.getText();
	//	System.out.println(usertext);
		
	//	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(usertext, Keys.ENTER);
		//li[@class='topnav_item livingunit']/span[@class='topnav_itemname']
		WebElement sale=driver.findElement(By.xpath("//span[@class='topnav_itemname']"));
		
		Actions a = new Actions(driver);
		
		
		
		a.moveToElement(sale).perform();
		Thread.sleep(3000);
		
		takeSshot.takeSshot("menu", driver);
		
	
		
		driver.findElement(By.xpath("//li[@class='topnav_item saleunit']/descendant::span[contains(.,'Beds')]")).click();
		
		
	}

}
