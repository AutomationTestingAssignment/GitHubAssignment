package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver driver;
	
	public DashboardPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
//Locators
	@FindBy(xpath="//img[@class='avatar circle']") WebElement avatarCircleIcon;
	@FindBy(xpath="//span[contains(text(),'Your profile')]") WebElement yourProfileOption;
	
//	Navigate to profile
	public void clickOnAvatarCircleIcon() {
		avatarCircleIcon.click();
	}
	public void clickYourProfileOption() {
		yourProfileOption.click();
	}
}
