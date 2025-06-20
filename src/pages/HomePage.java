package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//a[@href='/login'])[2]") WebElement signUpButton;
	
//	Clicking SignUp Button on HomePage of GitHub
	public void clickonSignupBtn() {
		signUpButton.click();
	}
	
	
	
}
