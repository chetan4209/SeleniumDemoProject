import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BT {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement AllJewellery=driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery.html']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(AllJewellery).perform();
		
		driver.findElement(By.xpath("//span[@data-p='mens-jewellery-kadas,m']")).click();
		driver.findElement(By.xpath("//img[@alt='The Alok Kada For Him']")).click();
		//img[@alt='The Alok Kada For Him']
		
String parent=driver.getWindowHandle();     //parent window handle
		
		

		Set<String> tabs= driver.getWindowHandles();
		for(String child:tabs)
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		 WebElement username =driver.findElement(By.xpath("//div/div[contains(.,'* This field is required')]"));
	      	String usertext = username.getText();
	    	System.out.println(usertext); 
		
		//div/div[contains(.,'* This field is required')]
		
		//input[@id='buy-now']
	}

}
