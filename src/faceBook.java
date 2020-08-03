import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.facebook.com");
		
		WebElement username=driver.findElement(By.xpath("//label[@for='email']"));
		
		String usertext = username.getText();
		System.out.println(usertext);
		driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']")).sendKeys(usertext);
		//input[@class='inputtext login_form_input_box']
		
		WebElement password=driver.findElement(By.xpath("//label[@for='pass']"));
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password.getText(),Keys.ENTER);
		
		
		
	}

}
