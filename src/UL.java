

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UL {
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize(); // maximize browser window
    driver.get("https://www.urbanladder.com/");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Thread.sleep(10000);
	// a[@class='close-reveal-modal hide-mobile']
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	//Thread.sleep(2000);
	List<WebElement> menus = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	System.out.println(menus.getClass());
	System.out.println("=====================================================");
	Actions a=new Actions(driver);
	for (WebElement menuName : menus){
		String name =menuName.getText();
		Thread.sleep(2000);
		takeSshot.takeSshot("menu", driver);
		System.err.println(name);
		//Thread.sleep(2000);
		a.moveToElement(menuName).perform();
		Thread.sleep(2000);
		takeSshot.takeSshot(name, driver);
		Thread.sleep(2000);
		List<WebElement> subMenus = driver.findElements(By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		
		for (WebElement subMenuName : subMenus){
		System.out.println(subMenuName.getText());
			
		
		
	}
	}
	}}
