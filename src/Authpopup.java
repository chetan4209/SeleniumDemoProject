import org.openqa.selenium.chrome.ChromeDriver;

public class Authpopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //driver.navigate().to("https://username:password@the-internet.herokuapp.com/basic_auth");
}
}