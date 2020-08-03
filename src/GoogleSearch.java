

import org.openqa.selenium.Keys;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		driver.findElementByXPath("//*[@id=\'tsf\']/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("java",Keys.ENTER);
		
		Thread.sleep(2000);
				
		driver.findElementByXPath("//h3[@class='LC20lb DKV0Md']").click();

}
}
