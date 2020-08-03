package Org.qsp.testNGdemo;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.google.common.io.Files;

public class RedBus {
	@Test
	public void m1() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co); 
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.redbus.in/"); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("Pune");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.xpath("//*[@id='dest']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.xpath("//*[@id=\'onward_cal\']")).click();
		//WebElement button = driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button"));
		Thread.sleep(2000);
		 int i=1;
	     while(i<5) {
	    	 driver.findElement(By.xpath("//td[@class='next']")).click();
	    	 i++;
	    	}
	     driver.findElement(By.xpath("//td[contains(.,'25')]")).click();
	     Thread.sleep(2000);
	     WebElement search= driver.findElement(By.xpath("//button[@class='fl button']"));
	     Actions a = new Actions(driver);
		 a.moveToElement(search).perform();
		 driver.findElement(By.xpath("//button[@class='fl button']")).click();
		// ScreenShot.takeSshot("redbus", driver);
		 TakesScreenshot ts = (TakesScreenshot) driver;
			File ScreenShot = ts.getScreenshotAs(OutputType.FILE);
	        File screenshotsave = new File("./ScreenShot/Redbus.png");
	        Files.copy(ScreenShot, screenshotsave);
		 
	     
	     }
		 }

