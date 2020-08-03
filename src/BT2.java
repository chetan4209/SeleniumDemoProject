import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BT2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.bluestone.com");
		
		Thread.sleep(10000);
		
		List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		
		System.out.println(menus.getClass());
		
		
		System.out.println("=====================================================");
		
		Actions a=new Actions(driver);
		for (WebElement menuName : menus){
			System.out.println(menuName.getText());
			Thread.sleep(2000);
			a.moveToElement(menuName).perform();
			Thread.sleep(2000);
			takeSshot.takeSshot(name, driver);
			Thread.sleep(2000);
		}
	}
	
}
