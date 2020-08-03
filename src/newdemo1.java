import org.openqa.selenium.chrome.ChromeDriver;

public class newdemo1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe"); //launching the browser
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();  //maximize browser window
		//driver.get("https://www.facebook.com");  //loading url
		driver.navigate().to("https://www.naukri.com");
		String parent=driver.getWindowHandle();
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println("==========" + driver.getTitle());
	}
}
		