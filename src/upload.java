import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload {
	public static void main(String[] args) throws IOException, Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize browser window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.sodapdf.com/txt-to-pdf/");
        Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ng-binding']")).click();
		  Thread.sleep(3000);
		Runtime.getRuntime().exec("‪‪‪‪‪.\\Data\\uploadAutoit1.exe");

}
}