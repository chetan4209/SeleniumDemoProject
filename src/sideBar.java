import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sideBar {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,10000)");//scrollDown
        //Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0,-2000)");//scrollUp
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll fullDown
        Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//scroll fullUp

}
}