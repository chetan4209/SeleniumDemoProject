import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
     public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.selenium.dev/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement search = driver.findElement(By.name("search"));
	    search.sendKeys("java" , Keys.ENTER);
	    driver.navigate().back();
	    search.sendKeys("testNG",Keys.ENTER);

	}

}
