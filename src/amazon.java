import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.amazon.in");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       WebElement ele = driver.findElement(By.xpath("//img[@alt='Indulekha Bhringa Hair Oil']"));
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].scrollIntoView()",ele);
       // js.executeScript("window.scrollBy(200,0)");//scrollRight
        //Thread.sleep(3000);
        //js.executeScript("window.scrollBy(-50,0)");//scrollLrft
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll fullDown
       // Thread.sleep(3000);
       // TakesScreenshot ts = (TakesScreenshot) driver;
		//File ScreenShot = ts.getScreenshotAs(OutputType.FILE);
        //File screenshotsave = new File("./ScreenShot/amazon.png");
        //Files.copy(ScreenShot, screenshotsave);

}
}