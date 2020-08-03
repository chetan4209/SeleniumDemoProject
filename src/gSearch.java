import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		
		//WebElement webSite=driver.findElement(By.xpath("//h3[contains(.,'Java Tutorial | Learn Java - javatpoint')]"));
		
		Thread.sleep(2000);
		
		List<WebElement> menus = driver.findElements(By.xpath("//div[@class='g']"));
		
		System.out.println(menus.getClass());
		
		System.out.println("=====================================================");
		
		Actions a=new Actions(driver);
		for (WebElement menuName : menus){
			String name =menuName.getText();
			System.err.println(name);
			Thread.sleep(2000);
			a.moveToElement(menuName).perform();
		
		
			}
		}

}
