import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.findElement(By.xpath("//*[@id=\'details-button\']")).click();
		
		driver.findElement(By.xpath("//*[@id=\'proceed-link\']")).click();
		
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		WebElement dEle= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		//a.contextClick(ele).perform();
		a.doubleClick(dEle).perform();

		
		//*[@id="authentication"]/span
		
		//html/body/div/div[3]/p[2]/a
		//*[@id="proceed-link"]
}
}