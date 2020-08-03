import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement images = driver.findElement(By.xpath("//a[@data-pid='2']"));
		Actions a = new Actions(driver);
		a.moveToElement(images).perform();
		//WebElement gmail = driver.findElement(By.xpath("//a[@data-pid='23']"));
		//Actions b = new Actions(driver);
		
	
		

}
}