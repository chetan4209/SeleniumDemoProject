import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser window
		//driver.get("https://www.facebook.com");  //loading url
		driver.navigate().to("https://www.naukri.com");
		String parent=driver.getWindowHandle();     //parent window handle
		System.out.println("parent window handle" + parent);
		Thread.sleep(2000);
		Set<String> windows= driver.getWindowHandles();
		windows.remove(parent);
		for (String win : windows) {
			System.out.println("All window handle" + win);
		
		driver.switchTo().window(win);
		driver.close();
		
		}	
	
	}
}
		