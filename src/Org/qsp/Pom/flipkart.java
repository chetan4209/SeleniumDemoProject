package Org.qsp.Pom;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart {
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement closebutton;
	@FindBy(xpath="//span[contains(.,'Electronics')]")
    private WebElement electronics ;
    @FindBy(xpath="/html/body/div/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a")
    private WebElement mi ;
    @FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
    private WebElement phone ;
    @FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")
    private WebElement Buy;
    
	public flipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	public void click() {
		closebutton.click();
	}
	public void mouseOver(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(electronics).build().perform();
		}
	public void mi() {
		mi.click();
	}
	public void phone(){
		phone.click();
	}
	public void switchTab(WebDriver driver) {
		Set<String> subtab = driver.getWindowHandles();
		for (String tab : subtab) {
			driver.switchTo().window(tab);
		}
}
	public void Buy(){
		Buy.click();
	}
   }


