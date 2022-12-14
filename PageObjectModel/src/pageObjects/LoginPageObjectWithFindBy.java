package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjectWithFindBy {
	
	@FindBy(how =How.ID,using ="txtUsername")
	public static WebElement userName;
	
	@FindBy(id = "txtPassword")
	public static WebElement password;
	
	@FindBy(id = "btnLogin")
	public static WebElement loginButton;

}
