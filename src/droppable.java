import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://jqueryui.com/droppable/");
	
	
		WebElement frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		
		WebElement draggable= driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable= driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(draggable, droppable).perform();
		
		System.out.println(droppable.getText());
}
}


