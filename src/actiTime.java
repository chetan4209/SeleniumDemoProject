import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager" , Keys.ENTER);
	    driver.findElement(By.xpath("//div[@id='container_reports']")).click();
        driver.findElement(By.xpath("//span[contains(.,'Create Chart')]")).click();
       
        WebElement Dress=driver.findElement(By.xpath("//div[@class='addToDashboard']"));
        Actions a = new Actions(driver);   //class
		a.moveToElement(Dress).perform();  //method
		driver.findElement(By.xpath("//div[@class='addToDashboard']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Chetan" , Keys.ENTER);
		driver.findElement(By.xpath("//td[@class='saveNewConfigButton greyButton']/descendant::span[contains(.,'Save')]")).click();
		driver.findElement(By.xpath("//div[@id='closeCreateChartLightboxButton']")).click();
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
	    
		

		
		
		//td[@class='saveNewConfigButton greyButton']/descendant::span[contains(.,'Save')]
		//input[@class='reportNameEdit inputFieldWithPlaceholder']
        //driver.findElement(By.xpath(" //div[@class='addToDashboardIcon']/parent::td/following-sibling::td/div[contains(.,'Add to Dashboard')]")).click();
    	
    	//div[@id='container_reports']
		//driver.findElement(By.partialLinkText("© actiTIME Inc.")).click();
       //div[contains(.,'Add to Dashboard')]
		 
		
	}
}


