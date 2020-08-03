import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoMultiselect {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser window
		driver.get("file:///C:/Users/hp/Desktop/html/new%202.html");  //loading url
		WebElement ele = driver.findElement(By.id("b"));
		Select s =new Select(ele);
		List<WebElement> opts = s.getOptions();
		if(s.isMultiple())
			for(WebElement opt : opts) {
				s.selectByValue(opt.getText());
				Thread.sleep(2000);
			//	s.deselectAll();
			}

}
}

































