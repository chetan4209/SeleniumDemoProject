import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draggable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://jqueryui.com/draggable/");
	
	
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		

		Actions a = new Actions(driver);
		
		WebElement draggable= driver.findElement(By.xpath("//div[@id='draggable']"));
	
		a.dragAndDropBy(draggable,150, 0).perform();
}
}
