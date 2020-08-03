package Org.qsp.testNGdemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class googleDemo {
	@Test
	public void googleM1(){
        System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.findElementByXPath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("java",Keys.ENTER);
		Reporter.log("M1" , true);
		driver.close();
		}
	@Test
	public void googleM2(){
		 System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com");
			driver.findElementByXPath("C").sendKeys("Oneplus",Keys.ENTER);
			Reporter.log("M2" , true);
			driver.close();
	}

}
