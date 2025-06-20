package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserProfilePage;

public class BaseTest {
	WebDriver driver;
	HomePage homepage; LoginPage loginPage;DashboardPage dashboardPage;UserProfilePage userProfilePage;
	
	@BeforeTest
	public void launchBrowserAndInitialization() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/");
		homepage=new HomePage(driver);
		loginPage= new LoginPage(driver);
		dashboardPage= new DashboardPage(driver);
		userProfilePage= new UserProfilePage(driver);
	}
	
//	Log in to GitHub
	@Test(priority=1)
	public void loginToGitHub() {
		homepage.clickonSignupBtn();
		loginPage.signInCredentials("AutomationTestingAssignment","Purvaj@12345");
	}
	
//	Navigate to the user profile
	@Test(priority=2)
	public void navigateToUserProfile() {
		dashboardPage.clickOnAvatarCircleIcon();
		dashboardPage.clickYourProfileOption();
	}
	
//	Validate the logged-in username
	@Test(priority=3)
	public void validateLoggedinUserName() {
		userProfilePage.verifyUserName();
		Assert.assertEquals(userProfilePage.verifyUserName(), "AutomationTestingAssignment");
	}
}
