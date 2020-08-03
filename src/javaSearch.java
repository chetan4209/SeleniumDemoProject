import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaSearch {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java",Keys.ENTER);
		try {
			  while (true)
			  {
			    driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
			  }
		}
			catch (Exception e) {
			  driver.findElement(By.xpath("//span[@style='display:block;margin-left:53px']")).click();
			}
		}
}


