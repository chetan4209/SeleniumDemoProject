import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoguru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://demo.guru99.com/v1/index.php");
		
		driver.findElement(By.xpath("//*[@id=\'details-button\']")).click();
		
		driver.findElement(By.xpath("//*[@id=\'proceed-link\']")).click();
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();

	}

}
