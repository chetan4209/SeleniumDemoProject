import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoPractice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window
        driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Dress=driver.findElement(By.xpath("//a[@title='Women']/parent::li/following-sibling::li/a[@class='sf-with-ul']"));
		Actions a = new Actions(driver);
		a.moveToElement(Dress).perform();
		driver.findElement(By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']/following::a[@title='Casual Dresses']")).click();
			//Thread.sleep(2000);
		    //driver.findElement(By.xpath("//img[@alt='Printed Dress']")).click();
			WebElement buy=driver.findElement(By.xpath("//img[@title='Printed Dress']"));
			Actions b = new Actions(driver);
			b.moveToElement(buy).perform();
	        driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
	        driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	        driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
	        // driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
	        driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("java",Keys.ENTER);
	        // driver.findElement(By.xpath("//li[contains(.,'Invalid email address.')]"));
	        //driver.findElement(By.xpath("//li[contains(.,'Invalid email address.')]")).getText();
	        WebElement username =driver.findElement(By.xpath("//li[contains(.,'Invalid email address.')]"));
	      	String usertext = username.getText();
	    	System.out.println(usertext); 
	        
	        
	        
	        
	        
	     
			//System.out.println(driver.findElement(By.xpath("//div[@id='create_account_error']")));
		
	        
	      //li[contains(.,'Invalid email address.')]
	      //input[@id='email_create']
	      //a[@class='button btn btn-default standard-checkout button-medium']
	      //a[@title='Proceed to checkout']
			//span[contains(.,'Add to cart')]/parent::button
			//img[@alt='Printed Dress']
			//ul[@class='submenu-container clearfix first-in-line-xs']/following::a[@title='Casual Dresses']
		    //a[@title='Women']/parent::li/following-sibling::li/a[@class='sf-with-ul']
		

}
}