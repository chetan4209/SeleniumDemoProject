package Org.qsp.testNGdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelClass2 {
		@Test
		public void m1() {
			 System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.navigate().to("https://www.facebook.com");
				driver.close();
			System.out.println("Two");
		}

	}



