import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser window
		//driver.get("https://www.facebook.com");  //loading url
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		
		WebElement day = driver.findElementByXPath("//select[@name='birthday_day']");
		Select sday= new Select(day);
		sday.selectByValue("13");
		//driver.findElementByXPath("//select[@name='birthday_day']").click();
		Thread.sleep(2000);
		

		WebElement month = driver.findElementByXPath("//select[@name='birthday_month']");
		Select m= new Select(month);
		m.selectByValue("11");
		Thread.sleep(2000);
		
		WebElement year = driver.findElementByXPath("//select[@name='birthday_year']");
		Select y= new Select(year);
		y.selectByIndex(31);
		//y.selectByVisibleText("1990");  //running
	   //y.selectByValue("1990");  //running
		
		System.out.println("===========================================================");
		
		List<WebElement> days = sday.getOptions();
		for (WebElement dayValue : days) {
		System.out.println(dayValue.getText());
		
		
     
	
		
		
		
		//driver.findElementByXPath("//option[@value='13']").click();
	
	//	driver.findElementByXPath("//select[@name='birthday_month']").click();
		
		//driver.findElementByXPath("	//option[contains(.,'Nov')]").click();
	

		
		//driver.findElementByXPath("//select[@name='birthday_year']").click();
	
		
		//driver.findElementByXPath("//option[@value='1990']").click();
		}	
}
}
