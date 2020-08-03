import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customwait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("file:///C:/Users/hp/Desktop/html/test.html");
		//new WebDriverWait(driver , 10).until(new ExpectedCondition<Boolean()>){
		
}
}