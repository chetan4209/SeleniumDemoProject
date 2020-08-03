import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class takeSshot {
	public static void takeSshot (String name, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ScreenShot = ts.getScreenshotAs(OutputType.FILE);
        File screenshotsave = new File("./ScreenShot/" + name + ".png");
        Files.copy(ScreenShot, screenshotsave);
		
	}

}
