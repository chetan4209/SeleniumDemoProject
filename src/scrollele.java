import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.selenium.dev/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ele = driver.findElement(By.xpath("//input[@alt='PayPal - The safer, easier way to pay online!']"));
        
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView()", ele);
    

	}

}
