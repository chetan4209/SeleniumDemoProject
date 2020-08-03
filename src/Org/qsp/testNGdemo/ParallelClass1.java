package Org.qsp.testNGdemo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass1 {
	@Test
	public void m1() {
		 System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.google.com");
			driver.findElementByXPath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("java",Keys.ENTER);
			driver.close();
		System.out.println("one");
	}

}
