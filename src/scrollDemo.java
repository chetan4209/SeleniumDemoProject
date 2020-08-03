import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.flipkart.com");
        Thread.sleep(10000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(200,0)");//scrollRight
        //Thread.sleep(3000);
        //js.executeScript("window.scrollBy(-50,0)");//scrollLrft
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll fullDown
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//scroll fullup
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(document.body.scrollWidth,0)");//scroll fullRight
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");//scroll fullLeft
}
}