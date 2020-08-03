package Org.qsp.testNGdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTestNG {
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize browser window
        driver.get("https://demo.actitime.com/login.do");
		Reporter.log("hey....!",true);
		}
	
	public class demo {
		@Test
		public void m2() {
			System.out.println("Hiiiiiiiiiiii");
			}

	}
}
