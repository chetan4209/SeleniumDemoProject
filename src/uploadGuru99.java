import java.io.IOException;  
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadGuru99 {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximize browser window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		driver.get("https://demo.guru99.com/test/upload/");
		
        driver.findElement(By.xpath("//*[@id=\'details-button\']")).click();
		
		driver.findElement(By.xpath("//*[@id=\'proceed-link\']")).click();
	
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(3000);
	
		
		Runtime.getRuntime().exec("‪‪‪‪‪F:\\texttopdf.exe");
}
}