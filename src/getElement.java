import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser window
		 driver.get("http://google.com");
		 driver.findElement(By.id("pass")).sendKeys("laisfisdi");

		 driver.findElement(By.name("email")).sendKeys("laisfisdi");
		 
		 driver.findElement(By.id("loginbutton")).click();
		

		 

}
}