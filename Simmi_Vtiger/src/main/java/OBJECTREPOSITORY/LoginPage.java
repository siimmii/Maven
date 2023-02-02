package OBJECTREPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "user_name")private WebElement usernametextfield;
	@FindBy(name = "user_password")private WebElement userpassword;
	@FindBy(id = "submitButton")private WebElement loginbutton;
	
	
	public WebElement getUsernametextfield() {
		return usernametextfield;
	}
	public WebElement getUserpassword() {
		return userpassword;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	
	public void loginToVtiger(String username,String pasword)
	{
		usernametextfield.sendKeys(username);
		userpassword.sendKeys(pasword);
		loginbutton.click();
	}

}

