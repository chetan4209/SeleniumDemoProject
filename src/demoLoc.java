

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLoc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.com");
		
		WebElement search = driver.findElement(By.name("q"));
        Point loc =search.getLocation();
		System.out.println(loc);
        int x=loc.getX();
        int y=loc.getY();
        System.out.println("x : " + x + " ======= " + " y : " + y);
}
}