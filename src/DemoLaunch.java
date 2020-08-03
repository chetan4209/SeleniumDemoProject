import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser window
		//driver.get("https://www.facebook.com");  //loading url
		driver.navigate().to("https://www.facebook.com");
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println("==========" + driver.getTitle());
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();   //closing the current tab in browser
		driver.quit();    //close all tabs and browser
	}
		
	}


