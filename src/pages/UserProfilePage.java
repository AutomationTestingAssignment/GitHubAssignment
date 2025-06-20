package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserProfilePage {
WebDriver driver;
	WebDriverWait wait;
	public UserProfilePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	//Locators
	@FindBy(xpath="(//span[contains(text(),'AutomationTestingAssignment')])[1]" )
	public WebElement userName;
	
//	Verify username
	public String verifyUserName() {
		wait.until(ExpectedConditions.visibilityOf(userName));
		return userName.getText();
		
	}
}
