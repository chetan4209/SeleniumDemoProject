import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blueStone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); // launching the browser

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize(); // maximize browser window

		driver.get("https://www.bluestone.com");
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("diamond ring",Keys.ENTER);
		
		Thread.sleep(10000);

		
		driver.findElement(By.xpath("//img[@src='https://kinclimg5.bluestone.com/f_webp,c_scale,w_515,b_rgb:f0f0f0/giproduct/BIVS0451R19_WAA18DIG6XXXXXXXX_ABCD00-PICS-00001-1024-33305.png']")).click();
		
		//img[@class='hc img-responsive center-block']
		
	    String parent=driver.getWindowHandle();     //parent window handle
		
		System.out.println("parent window id is " + parent);

		Set<String> tabs= driver.getWindowHandles();
		String title= driver.getTitle();
		System.out.println(title);
		
	
	      for(String child:tabs)
		  driver.switchTo().window(child);
		
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@class='exclusive btn style2 btn-block addToCart']")).click();
		
		  driver.switchTo().window(parent);
			
				
		
	}
}

