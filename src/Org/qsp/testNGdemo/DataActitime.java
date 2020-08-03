package Org.qsp.testNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataActitime {
	public class DataExcelDemo {
		@Test(dataProviderClass =ReadDataActi.class, dataProvider = "getData")
		public void m1(String UN, String PW) {
			System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();  
			driver.navigate().to("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement username= driver.findElement(By.id("username"));
		    WebElement password= driver.findElement(By.name("pwd"));
		    username.sendKeys(UN);
		    password.sendKeys(PW, Keys.ENTER);
		    driver.close();
		    
			
			
		}
		}

}
