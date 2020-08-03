import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTime1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		
	WebElement username =driver.findElement(By.xpath("//b[text()='admin']"));
		//b[text()='admin']
		
	String usertext = username.getText();
	System.out.println(usertext);
		
	//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usertext);
		
		//input[@name='pwd']
		
	//	WebElement password =driver.findElement(By.xpath("//b[contains(.,'manager')]"));
	//    System.out.println(password.getText());
	    
	 //   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(),Keys.ENTER);
		
		
		
		
		
		
		//b[contains(.,'manager')]
		
		
	

}
}
