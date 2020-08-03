package Org.qsp.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actitimeHome {
		@FindBy(name ="username")
		private WebElement username;
		@FindBy(name = "pwd")
		private WebElement password;
		@FindBy(xpath="//a[@id='loginButton']")
		private WebElement loginButton ;
		
		
			
			public actitimeHome(WebDriver driver) {
				PageFactory.initElements(driver, this);
			
		}

			public void sendText(String id) {
				username.sendKeys(id);
			}
			
				public void text(String pw) {
					password.sendKeys(pw);
				}
				
				public void clickLogin() {
					loginButton.click();
				
				
			}		
		
			
		
		
		

}
	
