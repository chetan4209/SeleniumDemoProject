package Org.qsp.testNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class blueStone {
	@Test
	public void m1(){
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

}
}