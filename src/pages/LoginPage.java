package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//Locators
	@FindBy(id="login_field") WebElement loginField;
	@FindBy(id="password") WebElement passwordField;
	@FindBy(xpath="//input[@type='submit']") WebElement signInButton;

// Entering username and password on the LoginPage
	public void signInCredentials(String username, String password) {
		loginField.sendKeys(username);
		passwordField.sendKeys(password);
		signInButton.click();
		
	}
}