import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ScreenShot = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsave = new File("./ScreenShot/Demo1.png");
        Files.copy(ScreenShot, screenshotsave);
        
	}
}