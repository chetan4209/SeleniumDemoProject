import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blueStonechat {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.bluestone.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Chat=driver.findElement(By.xpath("//a[@title='Coins']"));
        Actions a = new Actions(driver);
		a.moveToElement(Chat).perform();
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println("==========" + driver.getTitle());
		driver.close();

}
}