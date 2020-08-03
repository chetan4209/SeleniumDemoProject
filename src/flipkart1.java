import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flipkart1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();             
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("Java books" , Keys.ENTER);
        driver.findElement(By.xpath("//div[@class='_3ywJNQ']/descendant::div[contains(.,'Price -- Low to High')]")).click();
		List<WebElement> rating = driver.findElements(By.xpath("//div[@class='hGSR34']"));
		for (WebElement menuName : rating){
			String name =menuName.getText();
			System.err.println(name);
		
}
	}
}