package pageObjectsWithoutFindBy;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTestcaseUsingPageFactoryWithoutFindBy {

	public static WebElement txtUsername;
	
	public static WebElement txtPassword;
	
	public static WebElement btnLogin;

	@Test
	public static void LogintoApplication() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		PageFactory.initElements(driver, LoginTestcaseUsingPageFactoryWithoutFindBy.class);
		
		txtUsername.sendKeys("Admin");
		txtPassword.sendKeys("admin123");
		btnLogin.click();
		
		driver.quit();
		
		
	}



}
