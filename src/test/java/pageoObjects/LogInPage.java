package pageoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public WebDriver driver;
	
	public void LoginPage(WebDriver rdriver) {
		driver= rdriver;
		
		PageFactory.initElements(rdriver, this);
		
		
	}
@FindBy(id="Email")
@CacheLookup
WebElement textEmail;


@FindBy(id="password")
@CacheLookup
WebElement textpassword;

@FindBy(xpath="//input[@value='log in']")
@CacheLookup
WebElement btnLogin;

@FindBy(partialLinkText = "Logout")
@CacheLookup
WebElement lnkLogout;

public void setuserName(String uname) {
	
	textEmail.clear();
	textEmail.sendKeys(uname);
}

public void setuserPassword(String pwd) {
	
	textpassword.clear();
	textpassword.sendKeys(pwd);
}

public void clickLogin() {
	btnLogin.click();
}

public void clickLogOut() {
	
	lnkLogout.click();
	
}
}



